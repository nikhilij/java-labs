public class lab5 {
    public static void main(String[] args) {
        int x=0;
        int count=0;
        if(x==0||x==1){
            System.out.println("Given number is not a prime number");
            return;
        }
        for(int i=1;i<=x;i++){
            if(x%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("A prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}
