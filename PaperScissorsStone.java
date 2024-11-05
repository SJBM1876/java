import java.util.Random;
import java.util.Scanner;

public class PaperScissorsStone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            //1. Random computer choice

            // array of strings containing availiable choices.
            String [] availableMoves = {"Paper", "Scissors", "Stone"};

            // Using random function on idices of array to choose a random move.
            String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];

            System.out.println("The computer has made it's choice.");
            System.out.println();
            System.out.println("Now it's your turn to choose. Good Luck!");
            System.out.println();

            //2. Player's choice

            // input
            String userMove;

            // Loop until player makes a valid choice.
            while(true) {
                System.out.println("Please choose your move from the following available moves: 'Paper', 'Scissors' or 'Stone'");
                System.out.println("Please enter your choice: ");
                userMove = scanner.nextLine().toLowerCase();

                // Check if player has made a valid choice.
                if(userMove.equals("Paper") || userMove.equals("Scissors") || userMove.equals("Stone")) {
                    System.out.println();
                    break;
                }

                // If player's input was invalid.
                System.out.println();
                System.out.println("Invaild Move!!");
                System.out.println("Please choose from 'Paper', 'Scissors' or 'Stone'");
                System.out.println();
            }

            // Now print the computer's random choice.
            System.out.println("The computer chose : " + computerMove);

            //3. Comparing the player and the computer's choice and determining the winner.

            // Check if the choices made are the same.

            if(userMove.equals(computerMove)) {
                System.out.println("It's a draw!");
            }

            // Check other possibilities.
            else if (userMove.equals("Paper")) {
                if (computerMove.equals("Scissors")) {
                    System.out.println("The Computer Won!");
                    System.out.println("Better luck next time!");
                }
                else if (computerMove.equals("Stone")) {
                    System.out.println("You Won!!");
                    System.out.println("Congratulations!");
                }
            }
            else if (userMove.equals("Scissors")) {
                if (computerMove.equals("Stone")) {
                    System.out.println("The Computer Won!");
                    System.out.println("Better luck next time!");
                }
                else if (computerMove.equals("Paper")) {
                    System.out.println("You Won!!");
                    System.out.println("Better luck next time!");

                }
            }
            else if (userMove.equals("Stone")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("The Computer Won!");
                    System.out.println("Better luck next time!");
                }
                else if (computerMove.equals("Scissors")) {
                    System.out.println("You Won!!");
                    System.out.println("Better luck next time!");
                }
            }

            System.out.println();
            String playAgain;
            System.out.println("Would you like to play again? ");

            // Loop until the player chooses a valid option.
            while(true) {

                System.out.println("Type 'yes' or 'no'");
                playAgain = scanner.nextLine().toLowerCase();

                if (playAgain.equals("yes") || playAgain.equals("no")) {
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println();
                    break;
                }
                System.out.println();
                System.out.println("Inalid Input!");
                System.out.println();
            }
            if(playAgain.equals("no") || playAgain.equals("No")) {
                break;
            }
        }
    }
}
