import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcard {
    void Add(List<? extends Number> list){
        double count=0;
        for (Number i: list)
            count+=i.doubleValue();
        System.out.println(count);
    }

    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        List<Double> doubleList=new ArrayList<>();
        intList.add(90); intList.add(78); intList.add(65);
        doubleList.add(90.98); doubleList.add(0.96); doubleList.add(7.987);
        UpperBoundedWildcard object=new UpperBoundedWildcard();
        object.Add(intList);
        object.Add(doubleList);
    }
}
