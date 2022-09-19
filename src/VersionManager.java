import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.Scanner;

class VersionManagerClass{
    private int major;
    private int minor;
    private int patch;
    protected int prevMajor;
    protected int prevMinor;
    protected int prevPatch;

    public VersionManagerClass(int major, int minor, int patch) {
        if (major==-1&&minor==-1&&patch==-1){
            this.major=0;
            this.minor=0;
            this.patch=1;
        }
        else{
            this.major=major;
            this.minor=minor;
            this.patch=patch;
        }
        prevMajor=-1;
        prevMinor=-1;
        prevPatch=-1;
    }
    public void major(){
        prevMajor=major;
        major++;
    }
    public void minor(){
        prevMinor=minor;
        minor++;
    }
    public void patch(){
        prevPatch=patch;
        patch++;
    }
    public void rollback(){
        if (prevMajor == -1 && prevMinor == -1 && prevPatch == -1)
            System.out.println("Cannot rollback");
        else {
            if (prevMajor!=-1) {
                major=prevMajor;
                prevMajor=-1;
            }
            if (prevMinor!=-1) {
                minor=prevMinor;
                prevMinor=-1;
            }
            if (prevPatch!=-1) {
                patch=prevPatch;
                prevPatch=-1;
            }
        }

    }
    public String release(){
        return (Integer.toString(major)+"."+Integer.toString(minor)+"."+Integer.toString(patch));
    }
}

public class VersionManager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Initial version: ");
        int major, minor, patch;
        String input=sc.nextLine();
        if(input.equals(" ")){
            major=-1; minor=-1; patch=-1;
        }
        else {
            System.out.println(input);
            String[] inputArray = new String[4];
            int index = 0;
            for (String s : input.split("\\.")) {
                inputArray[index] = s;
                index++;
            }
            major = Integer.parseInt(inputArray[0]);
            minor = Integer.parseInt(inputArray[1]);
            patch = Integer.parseInt(inputArray[2]);
        }
        System.out.println("Enter commands: ");
        //System.out.println(major+" "+minor+" "+patch);
        VersionManagerClass versions=new VersionManagerClass(major, minor, patch);
        while(sc.hasNext()){
            String command=sc.nextLine();
            switch (command){
                case "major":
                    versions.major();
                    break;
                case "minor":
                    versions.minor();
                    break;
                case "patch":
                    versions.patch();
                    break;
                case "rollback":
                    versions.rollback();
                    break;
                case "release":
                    System.out.println(versions.release());
                    break;
            }
        }
    }
}
