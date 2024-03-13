// this is the program to check whether a string contains the other string or not

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();
        boolean containsSecondString = firstString.contains(secondString);
        System.out.println("Does the first string contain the second string? " + containsSecondString);
    }
}
