interface lambda{
    void run();
}

interface lambda2{
   int sumOfProduct(int a, int b, int c);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        lambda l=()->System.out.println("Code Running");
        l.run();
        lambda2 l2=(a,b, c)-> {
            int d=a*b, e=b*c, f=a*c;
            return (f+d+e);
        };
        System.out.println(l2.sumOfProduct(1,2, 1));
    }
}
