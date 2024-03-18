class example3 {
    public static void main(String[] args) {
        String inputString = "Massachusetts";
        char example3 = findexample3(inputString);
        System.out.println("First non-repeated character: " + example3);
    }

    private static char findexample3(String s) {
        int[] charCount = new int[256];
        for (char c : s.toCharArray()) {
            charCount[c]++;
        }
        for (char c : s.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }
        return '\0'; 
    }
}
