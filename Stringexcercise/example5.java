// package Stringexcercise;

public class example5 {
    public static void main(String[] args) {
        String s="Nikhil";

        s.concat(" Soni");//concat() method appends the
        // string at the end

        System.out.println(s);//will print Sachin because strings
        // are immutable objects
        String s1=s.concat(" Soni");
        System.out.println(s1);
    }
    
}
