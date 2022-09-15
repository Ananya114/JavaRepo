import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int n=str.length(); //17
        int[] start=new int[n];
        int[] end=new int[n];
        int index=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int k=i, l=j;
                boolean Palindrome=true;
                while(k<l){
                    if (str.charAt(k)!=str.charAt(l)){
                        Palindrome=false;
                        break;
                    }
                    k++;
                    l--;
                }
                if(Palindrome){
                    start[index]=i; end[index]=j;
                    index++;
                    i=j+1;
                    break;
                }
            }
        }
        int max=0, finalStart=0, finalEnd=0;
        for (int i=0;i<index;i++){
            if((end[i]-start[i])>max){
                max=end[i]-start[i];
                finalStart=start[i];
                finalEnd=end[i];
            }
        }
        for(int i=finalStart;i<=finalEnd;i++)
            System.out.print(str.charAt(i));
    }
}
