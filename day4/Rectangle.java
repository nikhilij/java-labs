import java.util.Scanner;

public class Rectangle {
    static Scanner scan=new Scanner(System.in);
    float length;
    float breadth;
    Rectangle(){
        System.out.println("Enter the length of the rectangle: ");
        this.length=scan.nextFloat();
        System.out.println("Enter the breadth of the rectangle : ");
        this.breadth=scan.nextFloat();
        System.out.println("Area : "+length*breadth);
        System.out.println("Perimeter: "+2*(length+breadth));
        
    }
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        scan.close();
    }
}
