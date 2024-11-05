import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console.
        Scanner scanner = new Scanner(System.in);

        // Initialize an integer variable 'value' to store the user input.
        int value;

        // Begin a do-while loop that continues until the user enters the number 5.
        do {
            // Prompt the user to enter a number.
            System.out.println("Enter a number: ");
            // Read an integer input from the user and assign it to 'value'.
            value = scanner.nextInt();
        }
        // Continue looping as long as 'value' is not equal to 5.
        while(value != 5);

        // When the loop exits (i.e., when 'value' is 5), print a message to the console.
        System.out.println("Got 5!");

        // Close the scanner to prevent resource leaks.
        scanner.close();
    }
}
