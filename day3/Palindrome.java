//Author Name: Nikhil Soni

import java.util.Scanner;

public class Palindrome {
    static void check(int number){
        int temp=number;
        int sum=0;
        int rem;
        while(temp!=0){
            rem=temp%10;
            sum=sum*10+rem;
            temp/=10;
        }
        if(sum==number){
            System.out.println("A palindrome number");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to check whether it is palindrome or not: ");
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        check(number);

    }
}
