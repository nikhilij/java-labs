import java.util.Scanner;
public class natural_numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many numbers = ");
        int n=scanner.nextInt();

        for(int i=1;i<n;i++){
            System.out.println(i); 
        }
    }
}
