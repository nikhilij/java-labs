import java.util.Scanner;

public class nOddnumbers {
    

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the last number to which you want = ");
        int n=scanner.nextInt();
        System.out.println("the number below  are the even numbers");
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("the numbers below are the odd numbers");
        for(int i=0;i<n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
