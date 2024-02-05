import java.util.Scanner;

public class Myvolume {
    static Scanner scan=new Scanner(System.in);
    float side;
    float length;
    float breadth;
    float height;
    double radius;
    Myvolume(float side){
        float volume=side*side;
        System.out.println("Volume of the cube: "+ volume);

    }
    Myvolume(float length,float breadth,float height){
        float volume=length*breadth*height;
        System.out.println("Volume of the cuboid : "+volume);

    }
    Myvolume(double radius){
        double volume=(4/3)*3.14*radius*radius;
        System.out.println("Volume of the sphere : "+volume);
    }

    public static void main(String[] args) {
        Myvolume cube=new Myvolume(5);
        Myvolume cuboid =new Myvolume(4, 5, 6);
        Myvolume sphere =new Myvolume((double)5);
    }
}
