//Author Name: Nikhil Soni

// Write a program to print your name, roll no, section and branch in separate lines.

import java.util.Scanner;

public class Name{
    static Scanner scan=new Scanner(System.in);
    int roll_no;
    String name;
    String branch;

     void input(){
        System.out.print("Enter your name : ");
        name=scan.nextLine();
        System.out.println("Enter you roll no: ");
        roll_no=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter you branch : ");
        branch=scan.nextLine();
    }

     void output(){
        System.out.println("Name:" +name );
        System.out.println("Roll No: "+roll_no);
        System.out.println("Branch: "+branch);
    }

    public static void main(String[] args) {
        Name info =new Name();
        info.input();
        info.output();
    }
}