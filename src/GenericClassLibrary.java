import java.util.Random;
class LibraryElement <T>{
    T type;
    String title;
    String Author;
    double cost;
    int serialNumber;
    public void LibraryElement(T type, String title, String Author, double cost) {
        Random rand=new Random();
        this.Author=Author;
        this.title=title;
        this.cost=cost;
        this.type=type;
        serialNumber= rand.nextInt(1000);
    }
    public void getInfo(){
        if (type=="String")
            System.out.println("This book titled "+title+" written by "+Author+" is available for "+cost+" at "+serialNumber);
        else if (type.equals(1))
            System.out.println("This video titled "+title+" uploaded by "+Author+" is available for "+cost+" at "+serialNumber);
        else
            System.out.println("This paper titled "+title+" published by "+Author+" is available for "+cost+" at "+serialNumber);
    }
}

//String-Book title, 1-video number, 'P'-newspaper
public class GenericClassLibrary {
    public static void main(String[] args) {
        LibraryElement<String> item1=new LibraryElement<>();
        item1.LibraryElement("String", "Summer of love", "Priyanka", 350.89);
        LibraryElement<Integer> item2=new LibraryElement<>();
        item2.LibraryElement(1, "How to read", "John", 798.89);
        LibraryElement<Character> item3=new LibraryElement<>();
        item3.LibraryElement('P',"War today","Yash", 30.5);
        item1.getInfo();
        item2.getInfo();
        item3.getInfo();
    }
}
