
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean playAgain;

        do {
            System.out.println("*********************");
            System.out.println("*******HANGMAN*******");
            System.out.println("*********************");

            // Step 1: Player 1 enters the word to be guessed with minimum length validation

            // Step 1: Player 1 enters the word to be guessed with minimum length validation
            String word;
            while (true) {
                System.out.println("Player 1, enter a word with at least 5 letters for Player 2 to guess:");
                word = scanner.nextLine().toLowerCase();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Good Luck Player 2!");

                // Check if the word has at least 5 letters and only contains alphabetic characters
                if (word.length() >= 5 && word.matches("[a-zA-Z]+")) {
                    break;
                } else {
                    System.out.println("Invalid word. Please enter a word with at least 5 letters (a-z only).");
                }
            }

            // Create a character array to hold the correct guesses
            char[] guessedWord = new char[word.length()];

            // Fill the guessedWord array with underscores for letters yet to be guessed
            for (int i = 0; i < guessedWord.length; i++) {
                guessedWord[i] = '_';
            }

            // Number of incorrect guesses allowed before losing
            int maxAttempts = 6;
            int attempts = 0;

            // StringBuilder to keep track of guessed letters
            StringBuilder guessedLetters = new StringBuilder();

            // Step 2: Player 2 tries to guess the word letter by letter
            System.out.println("Player 2, start guessing the letters!");

            // Game loop runs until Player 2 guesses the word or reaches max attempts
            while (attempts < maxAttempts && new String(guessedWord).contains("_")) {
                // Display the current state of the guessed word
                System.out.println("Word: " + new String(guessedWord));
                System.out.println("Incorrect guesses left: " + (maxAttempts - attempts));
                System.out.println("Guessed letters: " + guessedLetters);

                // Step 3: Player 2 inputs a letter to guess with validation
                char guess;
                while (true) {
                    System.out.print("Enter a letter: ");
                    String input = scanner.nextLine().toLowerCase();

                    // Check if input is a single letter between 'a' and 'z'
                    if (input.length() == 1 && input.charAt(0) >= 'a' && input.charAt(0) <= 'z') {
                        guess = input.charAt(0);
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a single letter from a to z.");
                    }
                }

                // If the letter has already been guessed, prompt again
                if (guessedLetters.toString().contains(String.valueOf(guess))) {
                    System.out.println("You already guessed that letter. Try again.");
                    continue;
                }

                // Add the guessed letter to the guessed letters list
                guessedLetters.append(guess).append(" ");

                // Check if the guessed letter is in the word
                boolean correctGuess = false;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        guessedWord[i] = guess; // Reveal the letter in the guessedWord array
                        correctGuess = true;
                    }
                }

                // If the guess was incorrect, increment the attempts counter
                if (!correctGuess) {
                    attempts++;
                    System.out.println("Incorrect guess!");
                } else {
                    System.out.println("Correct guess!");
                }

                System.out.println(); // Newline for better readability
            }

            // Step 4: End of the game
            if (new String(guessedWord).equals(word)) {
                System.out.println("Congratulations! You've guessed the word: " + word);
            } else {
                System.out.println("Sorry, you've run out of attempts. The word was: " + word);
            }

            // Ask if the player wants to play again with validation
            String response;
            while (true) {
                System.out.print("Would you like to play again? (yes/no): ");
                response = scanner.nextLine().trim().toLowerCase();
                if (response.equals("yes") || response.equals("no")) {
                    break; // Exit loop if the input is valid
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }
            playAgain = response.equals("yes");

        } while (playAgain);

        System.out.println("Thank you for playing Hangman!");
        scanner.close();
    }
}







