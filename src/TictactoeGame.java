import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
class NewGame{
    StringBuilder row1=new StringBuilder();
    StringBuilder row2=new StringBuilder();
    StringBuilder row3=new StringBuilder();
    ArrayList<Integer> available=new ArrayList<>();

    public static final Random pickBox=new Random();

    public NewGame() {
        row1.append("| 1 | 2 | 3 |\n_____________\n");
        row2.append("| 4 | 5 | 6 |\n_____________\n");
        row3.append("| 7 | 8 | 9 |\n_____________");

        for (int i=1;i<10;i++)
            available.add(i);
    }

    public void startGame(int n){

    }
    public void playerMove(int n){
        if (n<3){
            row1.replace(row1.indexOf(Integer.toString(n)), row1.indexOf(Integer.toString(n)), "X");
        }
        else if (n<6){
            row2.replace(row2.indexOf(Integer.toString(n)), row2.indexOf(Integer.toString(n)), "X");
        }
        else{
            row3.replace(row3.indexOf(Integer.toString(n)), row3.indexOf(Integer.toString(n)), "X");
        }
        for (int i=0;i<available.size();i++){
            if (available.get(i)==n)
                available.remove(i);
        }
    }
    public void opponentMove(){
        Integer[] availableArray=available.toArray(new Integer[0]);
        int n=availableArray[pickBox.nextInt(availableArray.length)];
        if (n<3){
            row1.replace(row1.indexOf(Integer.toString(n)), row1.indexOf(Integer.toString(n)), "O");
        }
        else if (n<6){
            row2.replace(row2.indexOf(Integer.toString(n)), row2.indexOf(Integer.toString(n)), "O");
        }
        else{
            row3.replace(row3.indexOf(Integer.toString(n)), row3.indexOf(Integer.toString(n)), "O");
        }
    }
    public void check(){

    }
}

public class TictactoeGame {
    public static void main(String[] args) {

    }
}
