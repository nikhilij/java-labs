//Author Name: Nikhil Soni

// Find the largest among 3 user entered nos. at the command prompt using Java
// Input: Enter three number .
// Output: Display the Largest Number

import java.util.Scanner;

public class Args {
    public static void main(String args[]) {
        System.out.println("Enter three numbers: ");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        if(a>b && a>c){
            System.out.println("largest is : "+a);
        }
        else if(b>a && b>c){
            System.out.println("largest is : "+b);

        }
        else if(c>a && c>a){
            System.out.println("largest is : "+c);
        }
    }
}
