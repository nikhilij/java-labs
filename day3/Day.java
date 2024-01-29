//Author Name: Nikhil Soni

// wap to print the week day for the given day no. of the    current month using switch case statement

import java.util.Scanner;

public class Day {
    static void display(int n){
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("Invalid Entery");
                break;
        }
    

    }
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the day no.: ");
        int day=scan.nextInt();
        scan.close();
        display(day);
    }
}
