import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Output the prompt
        System.out.println("Please enter your name: ");

        // Wait for the user to enter something
        String line = input.nextLine();

        // Tell them what they entered
        System.out.println("Your name is: " + line);
    }
}
