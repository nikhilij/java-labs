public class usingFinal4 {
    final int calculate(int a, int b){
        int sum=a+b;
        return sum;
    }
    int calculate(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        usingFinal4 b1= new usingFinal4();
        System.out.println(b1.calculate(2, 3));
        System.out.println(b1.calculate(2, 4));
        
        
    }
}
