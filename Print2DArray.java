public class Print2DArray {
    public static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                if (num < 10) {
                    System.out.print(" " + num + " "); // Print with leading space for single-digit numbers
                } else {
                    System.out.print(num + " "); // Print as-is for two-digit numbers
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

    public static void main(String[] args) {
        // Example 2D array
        int[][] array2D = {
            {1, 23, 4},
            {56, 7, 89},
            {10, 11, 12}
        };

        print2DArray(array2D);
    }
}
