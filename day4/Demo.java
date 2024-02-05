import java.util.Scanner;

class box {
    float length;
    float width;
    float height;
    box(float length,float width,float height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    void volume(float length,float width,float height){
        float v = length*width*height;
        System.out.println("volume of the box "+ v);
    }
}

public class Demo{

    public static void main(String[] args) {
        System.out.println("Enter the dimension of the box: ");
        Scanner scan = new Scanner(System.in);
        float length=scan.nextFloat();
        float width=scan.nextFloat();
        float height=scan.nextFloat();
        scan.close();
        box Box = new box(length, width, height);

        Box.volume(length, width, height);
    }
}
