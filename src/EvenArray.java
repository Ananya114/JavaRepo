import java.util.Scanner;

public class EvenArray {
    public static boolean even(int[] arr){
        boolean even=true;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
                even=false;
                break;
            }
        }
        return even;
    }

    public static boolean odd(int[] arr){
        boolean o=true;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0&&arr[i]>1){
                o=false;
                break;
            }
        }
        return o;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        if (even(arr))
            System.out.println(1+" - It's an even array");
        else if (odd(arr))
            System.out.println(2+" - It's an odd array");
        else
            System.out.println(3+" - It's a mixed array");
    }
}
