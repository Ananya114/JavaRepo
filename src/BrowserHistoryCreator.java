import java.util.ArrayList;
import java.util.Scanner;

class BrowserHistory{
    ArrayList<String> History = new ArrayList<>();
    int currentIndex=-1;
    public void BrowserHistory() {
        System.out.println("You're in homepage - null");
    }
    public void visit(String URL){
        History.add(currentIndex+1, URL);
        currentIndex++;
        if(currentIndex!=(History.size()-1)){
            History.subList(currentIndex+1, History.size()).clear();
            System.out.println(History);
        }
        System.out.println("You've moved to "+URL+" - null");
    }
    public void back(int steps){
        if (steps>currentIndex)
            steps=currentIndex;
        currentIndex-=steps;
        System.out.println("You've moved to "+History.get(currentIndex));
    }
    public void forward(int steps){
        if(steps>(History.size()-currentIndex-1))
            steps=(History.size()-currentIndex-1);
        currentIndex+=steps;
        System.out.println("You've moved to "+History.get(currentIndex));
    }
}

public class BrowserHistoryCreator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BrowserHistory newTab=new BrowserHistory();
        String command;
        String URL;
        int steps;
        while(sc.hasNext()){
            command=sc.next();
            if(command.contains("BrowserHistory")){
                newTab.BrowserHistory();
            }
            else if (command.contains("visit")){
                System.out.print("Enter URL: ");
                URL=sc.next();
                newTab.visit(URL);
            }
            else if (command.contains("back")){
                System.out.print("Enter steps:");
                steps=sc.nextInt();
                newTab.back(steps);
            }
            else if (command.contains("forward")){
                System.out.print("Enter steps:");
                steps=sc.nextInt();
                newTab.forward(steps);
            }
            else if (command.contains("exit")) {
                System.out.println("Thank you for visiting our website");
                break;
            }
            else
                System.out.println("Enter a valid command");
        }
    }
}
