import java.util.Scanner;

public class largest {
    public int largest_num(int a,int b,int c){
        int largest_number=Integer.MIN_VALUE;
        if(a>b&& a>c){
           largest_number = a;
        }
        else if(b>a&&b>c){
            largest_number =b;
        }
        else if(c>a&&c>a){
            largest_number= c;
        }
        return largest_number;
    }
    public static void main(String[] args) {
        largest l= new largest();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        scan.close();
        int largest_number=l.largest_num(a, b, c);
        System.out.println(largest_number);
        
    }
}
