import java.util.Scanner;

class CustomWrapperClass{
    private int number;
    CustomWrapperClass(int n){
        number=n;
    }
    public int getInt(){
        return number;
    }
    public String getString(){
        return Integer.toString(number);
    }
    public String getBinary(){
        return Integer.toBinaryString(number);
    }
    public boolean isEven(){
        if (number%2==0)
            return true;
        else
            return false;
    }
}

public class CustomWrapper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        CustomWrapperClass value=new CustomWrapperClass(n);
        System.out.println(value.getBinary());
        System.out.println(value.getInt());
        System.out.println(value.getString());
        System.out.println(value.isEven());
    }
}
