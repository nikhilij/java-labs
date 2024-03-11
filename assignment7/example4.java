public class example4 {
    public static void main(String[] args) {
        String inputString = "12345";
        boolean containsOnlyDigits = inputString.matches("\\d+");
        System.out.println("Contains only digits? " + containsOnlyDigits);
    }
}
