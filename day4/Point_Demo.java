//Author Name: Nikhil Soni

import java.lang.Math;

class Point {
    private int x, y, z;

    // Default constructor
    public Point() {
        x = 0;
        y = 0;
        z = 0;
    }

    // Parameterized constructor
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Copy constructor
    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
        this.z = point.z;
    }

    // Method to find distance from the origin (0,0,0)
    public float findDistance() {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    // Method to find distance between two points
    public float findDistance(int x1, int y1, int z1) {
        return (float) Math.sqrt(Math.pow((x - x1), 2) + Math.pow((y - y1), 2) + Math.pow((z - z1), 2));
    }

    // Method to find distance between two Point objects
    public float findDistance(Point P1) {
        return (float) Math.sqrt(Math.pow((x - P1.x), 2) + Math.pow((y - P1.y), 2) + Math.pow((z - P1.z), 2));
    }

    // Method to check if two points are equal
    public boolean isEqual(Point P1) {
        return x == P1.x && y == P1.y && z == P1.z;
    }

    // Method to display the description about the point object
    public void show() {
        System.out.println("Point: (" + x + ", " + y + ", " + z + ")");
    }
}

public class Point_Demo {
    public static void main(String[] args) {
        // Creating points
        Point origin = new Point();
        Point point1 = new Point(3, 4, 5);
        Point point2 = new Point(3, 4, 5);
        Point point3 = new Point(6, 8, 10);

        // Testing methods
        System.out.println("Distance from the origin: " + origin.findDistance());
        System.out.println("Distance between point1 and (3, 4, 5): " + point1.findDistance(3, 4, 5));
        System.out.println("Distance between point1 and point2: " + point1.findDistance(point2));
        System.out.println("Are point1 and point2 equal? " + point1.isEqual(point2));
        System.out.println("Are point1 and point3 equal? " + point1.isEqual(point3));

        // Displaying points
        System.out.println("Details of point1:");
        point1.show();
        System.out.println("Details of point2:");
        point2.show();
    }
}
