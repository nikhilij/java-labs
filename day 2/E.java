import java.util.Scanner;

public class E {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;

            // Check if the current element is already counted
            boolean isCounted = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isCounted = true;
                    break;
                }
            }

            if (!isCounted) {
                for (int j = 0; j < n; j++) {
                    if (a[i] == a[j]) {
                        count++;
                    }
                }

                System.out.println("Element " + a[i] + " occurs " + count + " times.");
            }
        }
    }
}
