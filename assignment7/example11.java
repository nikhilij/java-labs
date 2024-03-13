public class example11 {
    public static void main(String[] args) {
        String s = "Hello there i am Nikhil Soni";
        int count = 0;

        if (s== null || s.isEmpty()){
            return;
        }
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i)!='\0') {
                count++;
            }
        }
        count++; // this is for the end of the word
        System.out.println("Total number of words in the string is " + count);
    }
}
