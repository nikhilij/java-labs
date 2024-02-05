public class methodoverloading2 {
    static void area(float radius){
        float areaofCircle=3.14f*radius*radius;
        System.out.println("Area of Circle : "+areaofCircle);

    }
    static void area(float a,float c){
        float areaoftria=(1/2.0f)*a*c;
        System.out.println("Area of Triangle : "+areaoftria);

    }
    static void area(double side){
        double areaofsquare=side*side;
        System.out.println("Area of Square : "+areaofsquare);
    }

    public static void main(String[] args) {
        area(5.0); // changed this line
        area(5, 10);
        area((double) 5); // changed this line
    }
}
