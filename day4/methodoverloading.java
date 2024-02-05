public class methodoverloading {
    void subtract(int a,int b){
        System.out.println("Subtraction of "+a+" "+b+"is "+(a-b));
    }
    void subtract(int a,int b,int c){
        System.out.println("Subtraction of "+a+" "+b+" "+c+" is "+(a-b-c));
    }
    public static void main(String[] args) {
        methodoverloading met =new methodoverloading();
        met.subtract(5,6);
        met.subtract(10, 3,6);
    }
}
