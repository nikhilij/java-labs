    class OverloadingCal{  
      void sum(int a,long b)
      {System.out.println("a method invoked");}  
      void sum(long a,int b)
      {System.out.println("b method invoked");}  
      
      public static void main(String args[]){  
      OverloadingCal obj=new OverloadingCal();  
      obj.sum(20,20);//now ambiguity  
      }  
    }  
