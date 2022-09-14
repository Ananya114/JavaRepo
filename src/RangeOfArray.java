import java.util.Scanner;

public class RangeOfArray {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int min=Integer.MAX_VALUE, max=0;
        for (int i=0;i<n;i++){
            if (arr[i]<min)
                min=arr[i];
            else if (arr[i]>max)
                max=arr[i];
        }
        System.out.println("Range is "+(max-min));
    }
}
