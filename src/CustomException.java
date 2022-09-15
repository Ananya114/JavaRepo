import java.util.Scanner;

public class CustomException {

    public static class MyException extends java.lang.Exception{
        public MyException(String s) {
            super(s);
        }
    }
    public static void checkAge(int age) throws MyException{
        if (age==0)
            throw new MyException("Age not valid");
        else if (age<18)
            throw new MyException("Underage");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int age=sc.nextInt();
            checkAge(age);
            if (age>18)
                System.out.println("Adult!");
        }
        catch(Exception e){
            System.out.println("Exception encountered - "+e);
        }
        finally {
            System.out.println("Code ran succesfully");
        }
    }
}
