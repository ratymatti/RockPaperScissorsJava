import java.util.Scanner;

public class RockPaperScissors {
    String computerChoice;
    String userChoice;
    
    public String determineWinner() {
        String result;

        if (computerChoice.equals(userChoice)) {
            result = "It's a tie!"; 
        } else if (computerChoice.equals("rock") && userChoice.equals("scissors")) {
            result = "Computer won!";
        } else if (computerChoice.equals("paper") && userChoice.equals("rock")) {
            result = "Computer won!";
        } else if (computerChoice.equals("scissors") && userChoice.equals("paper")) {
            result = "Computer won!";
        } else {
            result = "You won!";
        }

        return result;
    }

    public static void main(String[] args) {
        
    }
}

