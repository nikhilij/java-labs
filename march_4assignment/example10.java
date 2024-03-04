package march_4assignment;
// package 4thmarch;
// Aim of the program - Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement.
// Input: Enter the  numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
// Output: Exception in thread “main” java.lang.ArrayIndexOutOfBoundsException:4
public class example10 {
    public static void main(String[] args) {
        int[] arr=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        
        try{
            // int[] arr=new int[4];
            for(int i=0;i<arr.length;i++){
                arr[i]=i+1;
            }
            arr[5]=5;
            
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
