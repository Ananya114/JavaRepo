import java.util.Scanner;


public class BiggestContainerFinder {
//(j-i)*(bigger height)-(1/2*(bigger height-smaller height)*(j-i)))

    public static int biggestContainer(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int base = j - i;
                int height=Math.min(heights[i], heights[j]);
                int area = (base*height);
                if (area > maxArea)
                    maxArea=area;
            }
        }
        return maxArea;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] heights=new int[n];
        for (int i=0;i<n;i++)
            heights[i]=sc.nextInt();
        System.out.println("Biggest Container area: "+ biggestContainer(heights));
    }
}
