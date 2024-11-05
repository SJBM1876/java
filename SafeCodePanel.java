public class SafeCodePanel {
    public static void main(String[] args) {
        // Define a 2D array representing the layout of the safe code panel.
        /* Each inner array represents a row of the panel, with each character
         representing a button on the safe's keypad */
        char[][] panel = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        /* Call the displayPanel method to print the panel to the console
         in the desired format, with each character separated by a space
        and each row on a new line. */
        displayPanel(panel);

    }

        /**
         * This method prints each character in the panel array with spaces in between
         * and moves to a new line after each row to create a grid-like display.
         *
         * @param panel 2D array representing the safe code panel layout
         */
        public static void displayPanel(char[][] panel) {
            //Outer loop, iterate over each row in the 2D array.
            for(char[] row : panel) {
                // Inner loop, iterate over each character in the current row.
                for (char ch : row) {
                    // Print the current character followed by a space to seperate characters.
                    System.out.print(ch + " ");
                }
                // After completing a row, move to the next line for a new row.
                System.out.println();
            }
        }
    }

