// package 4thmarch;

public class example4 {
    public static void main(String[] args) {
        
        try{
            int a[]=new int[10];
    
            a[12]=50; //ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }

        System.out.println("hello there this is rest of the code");
    }
}
