import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            // Prompt user for two integers.
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Calculate the sum, difference, and product.
            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;

            // Calculate the quotient, with a check for division by zero.
            if (num2 != 0) {
                int quotient = num1 / num2;
                System.out.println("Quotient: " + quotient);
            } else {
                System.out.println("Cannot divide by zero.");
            }

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);

    }
}

