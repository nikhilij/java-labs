import java.util.*;
public class B {
    public static void main(String[] args) {
        // the syntax to declare the array in java
        Scanner scanner=new Scanner(System.in);
        int a[]=new int[5];
        System.out.print("Enter the numbers : ");
        for(int i=0;i<5;i++){
            a[i]=scanner.nextInt();
        }

        for(int i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }
    }
}
