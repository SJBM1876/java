import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepCalculating = true; // Flag to control the loop

        while (keepCalculating) {
            System.out.println("----------------------------");
            System.out.println("      Basic Calculator");
            System.out.println("----------------------------");

            System.out.println("The following operations are supported: ");
            System.out.println("Addition (+) \n" + "Subtraction (-) \n" + "Multiplication (*) \n" + "Division (/)");

            int num1;
            int num2;

            // Ask for the first number with error handling
            while (true) {
                System.out.print("Enter the first number: ");
                try {
                    num1 = scanner.nextInt();
                    scanner.nextLine(); // Consume the leftover newline character
                    break; // Exit loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Error: Please enter a valid integer.");
                    scanner.nextLine(); // Clear the invalid input
                }
            }

            // Ask for the operator with validation
            char operator;
            while (true) {
                System.out.print("Enter an operator (+, -, *, /): ");
                operator = scanner.next().charAt(0);
                scanner.nextLine(); // Consume the leftover newline character

                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    break; // Exit loop if operator is valid
                } else {
                    System.out.println("Invalid operator! Please enter one of +, -, *, or /.");
                }
            }

            // Ask for the second number with error handling
            while (true) {
                System.out.print("Enter the second number: ");
                try {
                    num2 = scanner.nextInt();
                    scanner.nextLine(); // Consume the leftover newline character
                    break; // Exit loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Error: Please enter a valid integer.");
                    scanner.nextLine(); // Clear the invalid input
                }
            }

            // Perform the calculation
            int result = 0;
            boolean validOperation = true;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator. Please enter one of +, -, *, or /.");
                    validOperation = false;
            }

            // Display the result if the operation was valid
            if (validOperation) {
                System.out.println("Result: " + result);
            }

            // Ask if the user wants to perform another calculation
            String userResponse;
            while (true) {
                System.out.print("Would you like to perform another calculation? (yes/no): ");
                userResponse = scanner.nextLine().toLowerCase();

                if (userResponse.equals("yes") || userResponse.equals("no")) {
                    break; // Exit loop if input is valid
                } else {
                    System.out.println("Invalid input! Please enter 'yes' or 'no'.");
                }
            }

            // Update the loop flag based on user response
            keepCalculating = userResponse.equals("yes");
        }

        // Close the scanner when done
        scanner.close();
        System.out.println("Thank you for using the Basic Calculator. Goodbye!");
    }
}

