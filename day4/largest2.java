public class largest2 {
    public static void main(String args[]){
  int largest_num=Integer.parseInt(args[0]);
     for(int i=1;i<args.length;i++){
         int num=Integer.parseInt(args[i]);
         if(largest_num<num){
             largest_num=num;
         }
     }
     System.out.println("\nLargest number = "+largest_num);
    } 
 }