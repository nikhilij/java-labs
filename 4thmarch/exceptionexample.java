class exceptionexample{
    public static void main(String[] args) {
        try{
            String s=null;

        System.out.println(s.length());//NullPointerException
        }
        catch(NullPointerException n){

            System.out.println(n);

        }
    }
}