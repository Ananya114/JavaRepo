import java.util.Random;
import java.util.Scanner;

enum gameChoice{
    ROCK, PAPER, SCISSORS;

    public static final Random choicePicker=new Random();
    public static gameChoice chooseOpponentChoice(){
        gameChoice[] gameChoices=values();
        return (gameChoices[choicePicker.nextInt(3)]);
    }
}

class NewGame {
    int playerScore;
    int opponentScore;
    String playingType;

    public NewGame(String playingType) {
        playerScore=0;
        opponentScore=0;
        this.playingType=playingType;
    }
    public void startGame(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nPlayer's choice: ");
        String playerChoiceStr=sc.nextLine();
        gameChoice playerChoice=gameChoice.ROCK;
        gameChoice opponentChoice;
        switch (playerChoiceStr){
            case "ROCK":
                playerChoice=gameChoice.ROCK;
                break;
            case "PAPER":
                playerChoice=gameChoice.PAPER;
                break;
            case "SCISSORS":
                playerChoice=gameChoice.SCISSORS;
                break;
        }
        if (this.playingType.equals("S")){
            opponentChoice=gameChoice.chooseOpponentChoice();
            System.out.println("Opponent's choice: "+opponentChoice.toString());
        }
        else{
            System.out.print("Opponent's choice: ");
            String opponentChoiceStr=sc.nextLine();
            opponentChoice=gameChoice.ROCK;
            switch (opponentChoiceStr){
                case "ROCK":
                    opponentChoice=gameChoice.ROCK;
                    break;
                case "PAPER":
                    opponentChoice=gameChoice.PAPER;
                    break;
                case "SCISSORS":
                    opponentChoice=gameChoice.SCISSORS;
                    break;
            }
        }
        if (determineWinner(playerChoice, opponentChoice).equals("Player")) {
            this.playerScore++;
            System.out.println("\nPlayer scores.");
        }
        else if (determineWinner(playerChoice, opponentChoice).equals("Opponent")) {
            this.opponentScore++;
            System.out.println("\nOpponent scores.");
        }
        else
            System.out.println("\nNo one scores.");
    }
    public static String determineWinner(gameChoice playerChoice, gameChoice opponentChoice){
        String result="";
        switch (playerChoice) {
            case ROCK:
                switch (opponentChoice) {
                    case ROCK:
                        result = "Draw";
                        break;
                    case PAPER:
                        result = "Opponent";
                        break;
                    case SCISSORS:
                        result = "Player";
                        break;
                }
                break;
            case PAPER:
                switch (opponentChoice) {
                    case ROCK:
                        result = "Player";
                        break;
                    case PAPER:
                        result = "Draw";
                        break;
                    case SCISSORS:
                        result = "Opponent";
                        break;
                }
                break;
            case SCISSORS:
                switch (opponentChoice) {
                    case ROCK:
                        result = "Opponent";
                        break;
                    case PAPER:
                        result = "Player";
                        break;
                    case SCISSORS:
                        result = "Draw";
                        break;
                }
                break;
        }
        return result;
    }
    public void getResult(){
        System.out.println("\nPlayer's score: "+playerScore+"\nOpponent's score: "+opponentScore);
        if(playerScore>opponentScore)
            System.out.println("\nPlayer is the Winner.");
        else if (playerScore<opponentScore)
            System.out.println("\nOpponent is the Winner.");
        else
            System.out.println("\nIt's a draw.");
    }


}

public class RockPaperScissors {




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("----RPS tournament----\nPlease enter your name: ");
        String playerName=sc.nextLine();
        System.out.println("\nWelcome to RPS tournament, "+playerName+".");
        System.out.print("\nSingle player or Multi Player?(S/M): ");
        String playingType=sc.nextLine();
        NewGame newGame=new NewGame(playingType);
        System.out.print("Please press 'S' to start the game: ");
        if (sc.nextLine().equals("S")){
            do{
                System.out.println();
                newGame.startGame();
                System.out.print("\nWould you like to play again?(Y/N): ");
            }while(sc.nextLine().equals("Y"));
            newGame.getResult();
        }
        System.out.println("\nThanks for playing, "+playerName);
    }
}
