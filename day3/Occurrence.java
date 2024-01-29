import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter list of numbers separated by spaces: ");
        String input = scanner.nextLine();
        
        
        String[] numbersStr = input.split(" ");
        
        
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }
        
        int[] occurrenceCount = new int[101]; 
        
        // Count the occurrence of each element
        for (int num : numbers) {
            occurrenceCount[num]++;
        }
        
        // Print the occurrences of each element
        for (int i = 0; i < occurrenceCount.length; i++) {
            if (occurrenceCount[i] > 0) {
                System.out.println("Occurrence of " + i + " = " + occurrenceCount[i]);
            }
        }
        
        
        scanner.close();
    }
}
