import java.util.Scanner;

class NameMe{
    public String firstName;
    public String lastName;
    public String name;

    public NameMe(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.name=this.firstName+" "+this.lastName;
    }
}

public class FullnameGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.next();
        String lastName=sc.next();
        NameMe myName=new NameMe(firstName, lastName);
        System.out.println(myName.firstName);
        System.out.println(myName.lastName);
        System.out.println(myName.name);

    }
}
