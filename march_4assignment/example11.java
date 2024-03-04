package march_4assignment;
class example11{
    public static void main(String[] args) {
        try{
            int a=(5+2)/0;
            System.out.println(a);
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
        }

        finally{
        
            {System.out.println("finally block is always executed");}
            
            System.out.println("rest of the code...");
            
            }
        }
    }
