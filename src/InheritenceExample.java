interface Animal{
    void name();
    void origin();
}

class mammal{
    public void example(){
        System.out.println("Humans");
    }
}

class cat  extends mammal implements Animal{
    @Override
    public void name() {
        System.out.println("Cat");
    }

    @Override
    public void origin() {
        System.out.println("Africa");
    }

    @Override
    public void example() {
        System.out.println("Lion");
    }
}

class fluffy extends cat{
    @Override
    public void name() {
        System.out.println("Fluffy");
    }
}

public class InheritenceExample {
    public static void main(String[] args) {
        cat kitten=new cat();
        kitten.name();
        kitten.origin();
        kitten.example();
        fluffy fluff =new fluffy();
        fluff.name();
        fluff.origin();
    }
}
