public class GenericMethod {

    <T> void CostValue(T t){
        System.out.println("The cost is "+t);
    }

    public static void main(String[] args) {
        GenericMethod object=new GenericMethod();
        double cost=90.89;
        float cost1=90.65f;
        int cost2=70;
        object.CostValue(cost);
        object.CostValue(cost1);
        object.CostValue(cost2);
    }
}
