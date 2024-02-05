import java.util.Scanner;

public class countevenodd {
    

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter 10 numbers = ");
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=scanner.nextInt();

        }
        scanner.close();
        int count_even=0;
        int count_odd=0;
        for(int i=0;i<10;i++){
            if(i%2==0){
                count_even++;
            }
            if(i%2!=0){
                count_odd++;
            }
        }
        System.out.println("Number of even numbers: "+count_even);
        System.out.println("Number of odd numbers: "+count_odd);

        
    }
}
