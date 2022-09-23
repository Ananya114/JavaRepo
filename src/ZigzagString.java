import java.util.Scanner;

public class ZigzagString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        if (n==s.length())
            System.out.println(s);
        else{
            int x=(2*n)-2;
            StringBuilder strGiven=new StringBuilder();
            strGiven.append(s);
            StringBuilder[] strFinal=new StringBuilder[n];
            for (int i=0;i<n;i++){
                strFinal[i]=new StringBuilder();
                strFinal[i].append('R');
            }
            for (int i=0;i<strGiven.length();i++){
                int reminder=i%x;
                int j=Math.abs(reminder-x);
                if (j>=n)
                    j=Math.abs(j-x);
                strFinal[j].append(strGiven.charAt(i));
            }
            for (StringBuilder str: strFinal) {
                str.deleteCharAt(0);
                System.out.print(str);
            }
        }
    }
}
