import java.util.Arrays;

class example9{
     public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean areAnagrams = areAnagrams(str1, str2);
        System.out.println("Are the strings anagrams? " + areAnagrams);
    }

    private static boolean areAnagrams(String s1, String s2) {
        return Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray());
    }
}