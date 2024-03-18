public class example13 {
    public static void main(String[] args) {
        String input = "12345"; // Replace with the string you want to check
        System.out.println("Does the string contain only digits? " + containsOnlyDigits(input));
    }

    public static boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
