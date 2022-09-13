import java.util.Scanner;

public class HelloWorldPrinter {
    public static void main(String[] args){
        String day;
        Scanner sc=new Scanner(System.in);
        day= sc.nextLine();
        switch(day){
            case "Sunday":
                System.out.println("Holiday");
                break;
            case "Monday":
                System.out.println("Working day");
                break;
            case "Saturday":
                System.out.println("Holiday");
        }
    }
}
