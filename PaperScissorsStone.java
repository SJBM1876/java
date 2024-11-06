import java.util.Random;
import java.util.Scanner;

public class PaperScissorsStone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Best of three loop
        while (true) {
            // Initialize scores for the player and the computer
            int playerScore = 0;  // Track player's score for the best-of-three match
            int computerScore = 0;  // Track computer's score for the best-of-three match

            // Play rounds until either the player or computer reaches 2 wins
            while (playerScore < 2 && computerScore < 2) {  // Best of three condition
                // 1. Random computer choice
                String[] availableMoves = {"Paper", "Scissors", "Stone"}; // Creates an array of strings.
                String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];// Generates random integer between 0 and array length which is then stored in computer move.

                System.out.println("The computer has made its choice.");
                System.out.println();
                System.out.println("Now it's your turn to choose. Good Luck!");
                System.out.println();

                // 2. Player's choice
                String userMove;
                while (true) {
                    System.out.println("Please choose your move from 'Paper', 'Scissors', or 'Stone'");
                    System.out.print("Please enter your choice: ");
                    userMove = scanner.nextLine().toLowerCase();  // Reads everything the user types and convert input to lowercase

                    // Check if player has made a valid choice (in lowercase)
                    if (userMove.equals("paper") || userMove.equals("scissors") || userMove.equals("stone")) {
                        System.out.println();
                        break;
                    }

                    System.out.println("Invalid Move!! Please choose from 'Paper', 'Scissors', or 'Stone'");
                    System.out.println();
                }

                // Now print the computer's random choice
                System.out.println("The computer chose: " + computerMove);

                // 3. Determining the winner for the round
                if (userMove.equals(computerMove.toLowerCase())) {  // Compare in lowercase
                    System.out.println("It's a draw!");
                } else if (userMove.equals("paper") && computerMove.equals("Scissors") ||
                        userMove.equals("scissors") && computerMove.equals("Stone") ||
                        userMove.equals("stone") && computerMove.equals("Paper")) {
                    System.out.println("The Computer Won this round!");
                    computerScore++;  // Increment computer score for winning the round
                } else {
                    System.out.println("You Won this round!!");
                    playerScore++;  // Increment player score for winning the round
                }

                // Display current scores after each round
                System.out.println("Score: Player " + playerScore + " - Computer " + computerScore);
                System.out.println("**************************************************");
                System.out.println();
            }

            // Announce the winner of the best of three
            if (playerScore == 2) {  // Check if player reached 2 points
                System.out.println("Congratulations! You won the best of three!");
            } else {  // If computer reached 2 points
                System.out.println("The computer won the best of three. Better luck next time!");
            }

            // Ask if the player wants to play again
            String playAgain;
            System.out.println("Would you like to play another best of three?");

            while (true) {
                System.out.print("Type 'yes' or 'no': ");
                playAgain = scanner.nextLine().toLowerCase();

                if (playAgain.equals("yes") || playAgain.equals("no")) {
                    System.out.println("**************************************************");
                    break;
                }
                System.out.println("Invalid Input!");
            }

            // Exit the game if the player chooses "no"
            if (playAgain.equals("no")) {
                System.out.println("Thanks for playing!");
                break;

            }
        }
    }
}

