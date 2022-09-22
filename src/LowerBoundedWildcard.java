import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {
    void Print(List<? super Integer> list){
        for (Object i: list)
            System.out.print(i+" ");
    }

    public static void main(String[] args) {
        List<Number> list=new ArrayList<>();
        list.add(1); list.add(9.1); list.add(0.88f);
        LowerBoundedWildcard object=new LowerBoundedWildcard();
        object.Print(list);
    }
}
