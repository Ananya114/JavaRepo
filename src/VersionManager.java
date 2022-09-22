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
        prevMinor=minor;
        prevPatch=patch;
        major++;
        minor=0;
        patch=0;
    }
    public void minor(){
        prevMajor=major;
        prevMinor=minor;
        prevPatch=patch;
        minor++;
        patch=0;
    }
    public void patch(){
        prevMajor=major;
        prevMinor=minor;
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
        return (major+"."+minor+"."+patch);
    }
}

public class VersionManager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Initial version: ");
        int major, minor, patch;
            if(sc.hasNext()) {
                String input=sc.nextLine();
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
            else{
                major=-1; minor=-1; patch=-1;
            }
        System.out.println("Enter commands: ");
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
