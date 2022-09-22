import java.util.ArrayList;
import java.util.Scanner;

public class LongestPrefixStringFinder {
    public static String prefixString(ArrayList<String> strList){
        StringBuilder commonStringToCheck=new StringBuilder(strList.get(0));
        for (String s: strList){
            while (commonStringToCheck.length()!=0){
                if (!(s.startsWith(commonStringToCheck.toString()))){
                    commonStringToCheck.deleteCharAt(commonStringToCheck.length()-1);
                }
                else
                    break;
            }
        }
        return commonStringToCheck.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<String> inputStrings=new ArrayList<>();
        for (int i=0;i<n;i++)
            inputStrings.add(sc.next());
        System.out.println("Prefix: "+prefixString(inputStrings));
    }
}
