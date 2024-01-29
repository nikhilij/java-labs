// write a program to find the maximum and  minimum element in an array;
import java.util.Scanner;

public class D {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Find the maximum value
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        // find the minimum value
        int min=a[0];
        for(int i=0;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("The max value in the array is: " + max);
        System.out.print("The min value in the array is: "+ min);

        scanner.close();
    }
}
