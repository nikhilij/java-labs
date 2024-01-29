// write the program to print all the fibonacci series within a range;


// write a program to find the occurenece of each element in an array;
// write a program to reverse an array;

import java.util.Scanner;

public class C {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the range to print the Fibonacci series: ");
        int n = scanner.nextInt();

        C fg = new C();
        fg.gf(n);
    }

    int a = 0;
    int b = 1;

    public void gf(int range) {
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < range; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
