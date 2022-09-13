import java.util.Scanner;

public class IfElseLadder {
    public static void main(String[] args) {
        int numOne, numTwo, numThree;
        Scanner sc=new Scanner(System.in);
        numOne=sc.nextInt();
        numTwo=sc.nextInt();
        numThree=sc.nextInt();
        if(numOne>numTwo){
            if (numOne>numThree)
                System.out.println(numOne+" is the greatest");
            else
                System.out.println(numThree+" is the greatest");
        }
        else{
            if (numTwo>numThree)
                System.out.println(numTwo+" is the greatest");
            else
                System.out.println(numThree+" is the greatest");
        }
    }
}
