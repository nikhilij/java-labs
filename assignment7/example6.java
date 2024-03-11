// package assignment7;

public class example6 {
    public static void main(String[] args) {
        String inputString = "madam";
        boolean isPalindrome = inputString.equals(new StringBuilder(inputString).reverse().toString());
        System.out.println("Is the string a palindrome? " + isPalindrome);
    }
}
