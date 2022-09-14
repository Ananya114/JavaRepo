import java.util.Scanner;

public class DoraMangoTree {
    public static void main(String[] args) {
        int row, col, tree;
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        col= sc.nextInt();
        tree=sc.nextInt();
        if (tree>=1&&tree<=col)
            System.out.println("It's a Mango tree");
        else if ((tree-1)%col==0)
            System.out.println("It's a Mango tree");
        else if (tree%col==0)
            System.out.println("It's a Mango tree");
        else
            System.out.println("It's not a Mango tree");
    }
}
