import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int [][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.deepToString(grid)); // Use deepToString for 2D arrays

        String [][] text = {
                {"Port Vale"},
                {"Arsenal"},
                {"Wigan Athletic"},
                {"Everton"}
        };

        System.out.println(Arrays.toString(text[0])); // Prints the first string array
    }
}
