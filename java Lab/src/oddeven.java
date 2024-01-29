
import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number to check for even or odd= ");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();

        if(n%2==0){
            System.out.println("the input number is an even number");
        }
        
        else{
            System.out.println("The input number is an Odd number");
        }
    }
}
