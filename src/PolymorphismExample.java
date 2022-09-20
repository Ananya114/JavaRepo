class tree{
    public void type(){
        System.out.println("Tree");
    }
}

class fruits extends tree{
    @Override
    public void type() {
        System.out.println("Fruit tree");
    }
    public void details(String fruitName){
        System.out.println("It's a "+fruitName+" tree.");
    }
    public void details(int serialNumber){
        System.out.println("It's the "+serialNumber+"th tree.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        tree newTree=new tree();
        newTree.type();
        fruits Apple=new fruits();
        Apple.type();
        Apple.details(6);
        Apple.details("Apple");
    }
}
