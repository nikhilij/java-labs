//Author Name: Nikhil Soni

// wap to Accept 10 numbers from command line and check how many of them are even and how many are odd.

import java.util.Scanner;

public class checkevenOdd {
    static Scanner scan=new Scanner(System.in);
       
    public static void main(String[] args) {
        System.out.println("Enter the 10 numbers: ");
        int count_even=0,count_odd=0;
        for(int i=0;i<10;i++){
            int n=scan.nextInt();
            if(n%2==0){
                count_even++;
            }
            else{
                count_odd++;
            }
        }
        System.out.println("Number of even numbers are : "+count_even);
        System.out.println("Number of Odd numbers are : "+count_odd);
    }
}
