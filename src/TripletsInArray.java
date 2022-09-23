import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TripletsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++)
            array[i]=sc.nextInt();
        ArrayList<Integer[]> tripletArray=new ArrayList<>();
        int index=0;
        //inserting applicable elements into arrayList
        for (int i=0;i<n;i++){
            for (int j=i+1; j<n;j++){
                for (int k=j+1; k<n; k++){
                    if (array[i]+array[j]+array[k]==0&&(i!=j)&&(j!=k)&&(k!=i)){
                        Integer[] tempArray={array[i], array[j], array[k]};
                        tripletArray.add(index, tempArray);
                        index++;
                    }
                }
            }
        }
        //sorting and removing duplicate elements
        for (Integer[] arr: tripletArray)
            Arrays.sort(arr);
        for (int i=0;i<index;i++){
            for (int j=i+1;j<index;j++){
                if (Arrays.equals(tripletArray.get(i), tripletArray.get(j))){
                    tripletArray.remove(i);
                    index--;
                }
            }
        }
        //printing output in correct format
        System.out.print("[");
        for (int i=0;i<index;i++){
            System.out.print("[");
            for (int x: tripletArray.get(i))
                System.out.print(x+" ");
            System.out.print("]");
        }
        System.out.print("]");
    }
}
