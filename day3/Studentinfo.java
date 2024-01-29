//Author Name: Nikhil Soni

// Write a program to print your name, roll no, section and branch in separate lines.

import java.util.Scanner;

public class Studentinfo{
    static Scanner scan=new Scanner(System.in);
    int roll_no;
    String name;
    String branch;
    String section;

     void input(){
        System.out.print("Enter your name : ");
        name=scan.nextLine();
        System.out.println("Enter your roll no: ");
        roll_no=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your branch : ");
        branch=scan.nextLine();
        System.out.println("Enter your section: ");
        section=scan.nextLine();
    }

     void output(){
        System.out.println("Name:" +name );
        System.out.println("Roll No: "+roll_no);
        System.out.println("Branch: "+branch);
        System.out.println("Section: "+section);
    }

    public static void main(String[] args) {
        Studentinfo info =new Studentinfo();
        info.input();
        info.output();
    }
}