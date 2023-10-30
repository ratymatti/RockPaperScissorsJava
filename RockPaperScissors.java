import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    String computerChoice;
    String userChoice;

    public void getComputerChoice() {
        String[] options = {"rock", "paper", "scissors"};
        Random random = new Random();
        int randomIndex = random.nextInt(options.length);
        computerChoice = options[randomIndex];
    }

    public void getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.print("Enter your choice (rock, paper, or scissors): ");
        userInput = scanner.nextLine().toLowerCase();

        if (validateInput("choice", userInput)) {
            userChoice = userInput;
        } else {
            System.out.println("'" + userInput + "' is not valid input");
            getUserChoice();
        }
        
    }

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
 
    public boolean validateInput(String input, String submittedInput) {
        switch (input) {
            case "choice":
                if (submittedInput.equals("rock") || submittedInput.equals("paper") || submittedInput.equals("scissors")) {
                    return true;
                } else {
                    return false;
                } 
            default:
                return false;    
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain = "yes";

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (playAgain.equals("yes")) {
            RockPaperScissors game = new RockPaperScissors();

            game.getUserChoice();
            game.getComputerChoice();

            String result = game.determineWinner();
            System.out.println(result);

            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }
        scanner.close();
    }
}

