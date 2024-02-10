import java.util.Scanner;

public class plasticCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the shape type (sheet or box): ");
        String shapeType = scanner.nextLine().toLowerCase();

        if (shapeType.equals("sheet")) {
            System.out.println("Enter sheet dimensions (length, breadth): ");
            double length = scanner.nextDouble();
            double breadth = scanner.nextDouble();
            double sheetCost = length * breadth * 40; // Cost per sq ft = 40
            System.out.println("Cost of sheet: Rs." + sheetCost);
        } else if (shapeType.equals("box")) {
            System.out.println("Enter box dimensions (length, breadth, height): ");
            double length = scanner.nextDouble();
            double breadth = scanner.nextDouble();
            double height = scanner.nextDouble();
            double boxCost = 2 * (length * breadth + length * height + breadth * height) * 60; // Cost per cu ft = 60
            System.out.println("Cost of box: Rs." + boxCost);
        } else {
            System.out.println("Invalid shape type. Please enter 'sheet' or 'box'.");
        }
        scanner.close();
    }
}
