import java.util.Scanner;

public class Diagonalsum {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a 3x3 matrix
        System.out.println("Enter a 3x3 matrix:");
        int[][] matrix = new int[3][3];
        
        // Read the elements of the matrix from the user
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Calculate the sum of the left diagonal elements
        int leftDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            leftDiagonalSum += matrix[i][i];
        }
        
        // Calculate the sum of the right diagonal elements
        int rightDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            rightDiagonalSum += matrix[i][2 - i];
        }
        
        // Print the sum of the left diagonal elements
        System.out.println("Left=" + leftDiagonalSum);
        
        // Print the sum of the right diagonal elements
        System.out.println("Right=" + rightDiagonalSum);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
