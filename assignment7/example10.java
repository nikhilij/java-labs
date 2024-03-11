// package assignment7;

public class example10 {
    public static void main(String[] args) {
        String input = "Nikhil Soni";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
