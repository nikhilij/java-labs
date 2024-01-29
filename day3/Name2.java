//Author Name: Nikhil Soni


import java.util.Scanner;

public class Name2 {
    public static void main(String[] args) {
        System.out.print("Enter the first name : ");
        Scanner scan=new Scanner(System.in);
        String first_name=scan.nextLine();
        System.out.print("Enter the last name : ");
        String last_name=scan.nextLine();
        scan.close();

        System.out.println(first_name+" "+last_name);

    }
}
