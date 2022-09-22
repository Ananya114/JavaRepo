import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {
    void printAll(List<?> list){
        for (Object l: list)
            System.out.print(l+" ");
    }

    public static void main(String[] args) {
        List<Double> list=new ArrayList<>();
        list.add(10.01); list.add(90.09); list.add(80.00);
        UnboundedWildcard object=new UnboundedWildcard();
        List<Integer> intList=new ArrayList<>();
        intList.add(1); intList.add(9); intList.add(809);
        List<String> strList=new ArrayList<>();
        strList.add("India"); strList.add("Africa"); strList.add("America");
        object.printAll(list);
        System.out.println();
        object.printAll(intList);
        System.out.println();
        object.printAll(strList);
    }
}
