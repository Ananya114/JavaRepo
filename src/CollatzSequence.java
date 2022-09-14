import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        System.out.println(n);
        if (n==1)
            System.out.println(0);
        while(n!=1){
            if (n%2==0)
                n=n/2;
            else
                n=(3*n+1);
            System.out.println(n);
        }
    }
}
