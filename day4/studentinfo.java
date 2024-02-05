
import java.util.*;

public class studentinfo {
    static Scanner scan=new Scanner(System.in);
    int roll_no;
    int full_marks=100;
    int secured_marks;
    float cgpa;
    studentinfo(){
        System.out.println("Enter the roll no ");
        this.roll_no=scan.nextInt();
        System.out.println("Enter the marks secured");
        this.secured_marks=scan.nextInt();
    }
    void calculate(){
        this.cgpa=((float)secured_marks/full_marks)*10;
        
    }
    void display(){
        System.out.println("Roll no : "+roll_no);
        System.out.println("Secured marks: "+secured_marks);
        System.out.println("Cgpa: "+cgpa);
    }
    public static void main(String[] args) {
        studentinfo s1= new studentinfo();
        s1.calculate();
        s1.display();
    }
}
