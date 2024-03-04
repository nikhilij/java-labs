
public class example3 {
    public static void main(String[] args) {
        try{
            String s="Nikhil";

        int i=Integer.parseInt(s);//NumberFormatException
        }
        catch(NumberFormatException e3){
            System.out.println(e3);
        }

        System.out.println(i);
    }
}
