import java.util.Scanner;

class myIterator{
    int[] arr;
    int cursor;

    public myIterator(int[] arr) {
        this.arr = arr;
        cursor=-1;
    }
    public int next(){
        cursor++;
        return arr[cursor];
    }
    public boolean hasNext(){
        return(cursor!= arr.length-1);
    }
    public int peek(){
        return arr[cursor+1];
    }
}

public class PeekIterator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        myIterator it=new myIterator(arr);
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.peek());
        System.out.println(it.next());
    }
}
