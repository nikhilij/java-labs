//Author Name: Nikhil Soni
import java.util.*;
class Number {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPerfect() {
        int sum = 0;
        for (int i = 1; i < value; i++) {
            if (value % i == 0) {
                sum += i;
            }
        }
        return sum == value;
    }

    public int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
}

public class Number_Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int numValue=scan.nextInt();
        scan.close();

        Number num = new Number(numValue);

        System.out.println("Number: " + numValue);
        System.out.println("Is Even: " + num.isEven());
        System.out.println("Is Prime: " + num.isPrime());
        System.out.println("Is Perfect: " + num.isPerfect());
        System.out.println("Factorial: " + num.findFactorial(numValue));
    }
}
