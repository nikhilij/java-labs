public class example12 {
    public static void main(String[] args) {
        String s = "abcd";
        String s2 = "bcag";

        if(s==null || s2== null || s.isEmpty()|| s2.isEmpty()){
            return;
        }
        int[] a = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == s2.charAt(i)) {
                    a[j] = 1;
                }
            }
        }

        int flag = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 1) {
                flag = 0;
                break; // Exit the loop early if a mismatch is found
            }
        }

        if (flag == 1) {
            System.out.println("Strings are made of the same characters");
        } else {
            System.out.println("Strings are not made of the same characters");
        }
    }
}
