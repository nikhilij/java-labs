import java.util.Scanner;

class Triangle {
    private double a, b, c;

    public Triangle() {
        a = 0;
        b = 0;
        c = 0;
    }

    public void setDim(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public double findArea() {
        if (isTriangle()) {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        } else {
            System.out.println("Triangle with given sides cannot be formed.");
            return -1;
        }
    }

    public double findPerimeter() {
        if (isTriangle()) {
            return a + b + c;
        } else {
            System.out.println("Triangle with given sides cannot be formed.");
            return -1;
        }
    }

    public void show() {
        System.out.println("Sides of the triangle: " + a + ", " + b + ", " + c);
        if (isTriangle()) {
            System.out.println("Area of the triangle: " + findArea());
            System.out.println("Perimeter of the triangle: " + findPerimeter());
        }
    }
}

public class Triangle_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();

        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        triangle.setDim(a, b, c);

        System.out.println("Checking if triangle can be formed...");
        if (triangle.isTriangle()) {
            System.out.println("Triangle can be formed with given sides.");
            triangle.show();
        } else {
            System.out.println("Triangle cannot be formed with given sides.");
        }
    }
}
