// Write a Java class which has a method called ProcessInput(). This method checks the number entered by the user. If the entered number is negative then throw an user defined exception called NegativeNumberException, otherwise it displays the double value of the entered number.
// Input: Enter a number      4
// Output: Double value:  8
// Input: Enter a number    -4
// Output:   Caught the exception
// package march_4assignment;

class Process extends Exception{
    Process(String s){
        super(s);
    }
}
public class example12 {
    static void ProcessInput(int n)throws Process{
        if(n<0){
            throw new Process("NegativeNumberException: number should be positive");
        }
        else{
            System.out.println(n*2);
        }
    }
    public static void main(String[] args) {
        try{
            ProcessInput(4);
            ProcessInput(-4);
        }
        catch(Process p){
            System.out.println(p);  
        }
    }
}
