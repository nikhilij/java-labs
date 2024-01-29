//Author Name: Nikhil Soni

// wap to display the grade according to the marks obtained using if else statements

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        System.out.println("Enter you marks: ");
        Scanner scan= new Scanner(System.in);
        int marks=scan.nextInt();

        if(marks<=100 && marks>=90){
            System.out.println("Grade is 'O'");
        }
        else if(marks <90 && marks>=80){
            System.out.println("Grade is 'E'");
        }
        else if(marks <80  && marks>=70){
            System.out.println("Grade is 'A");
        }
        else if(marks <70 && marks>=60 ){
            System.out.println("Grade is 'B'");
        }
        else if (marks <60 && marks>=50){
            System.out.println("Grade is 'C'");
        }
        else if (marks<50){
            System.out.println(false);
        }
        scan.close();
    }
}
