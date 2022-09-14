import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        int row;
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        int[][] matrix=new int[row][row];
        for (int i=0;i<row;i++){
            for (int j=0;j<row;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int forDiag=0, backDiag=0;
        int[] rowSum=new int[row];
        int[] colSum=new int[row];
        for (int i=0;i<row;i++){
            rowSum[i]=0;
            colSum[i]=0;
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<row;j++){
                if (i==j)
                    forDiag+=matrix[i][j];
                if (i+j==row-1)
                    backDiag+=matrix[i][j];
                rowSum[i]+=matrix[i][j];
                colSum[j]+=matrix[i][j];
            }
        }
        int totRowSum=0, totColSum=0;
        for (int i=0;i<row;i++){
            totRowSum+=rowSum[i];
            totColSum+=colSum[i];
        }
        totRowSum=totRowSum/row;
        totColSum=totColSum/row;
        if (totColSum==totRowSum&&totColSum==forDiag&&totColSum==backDiag)
            System.out.println("It's a magic square.");
        else
            System.out.println("It's not a magic square");

    }
}
