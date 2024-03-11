// package assignment7;

public class example8 {
    public static void main(String[] args) {
        String inputString = "programming";
        for (char c : inputString.toCharArray()) {
            if (inputString.indexOf(c) != inputString.lastIndexOf(c)) {
                System.out.print(c + " ");
            }
        }
    }
}
