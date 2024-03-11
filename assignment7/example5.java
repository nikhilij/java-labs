

public class example5 {
    public static void main(String[] args) {
        String inputString = "programming";
        char charToRemove = 'm';
        String result = inputString.replace(String.valueOf(charToRemove), "");
        System.out.println("String after removing '" + charToRemove + "': " + result);
    }
}
