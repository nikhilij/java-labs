
class ParameterizedConstructor {
    int num;
    String str;

    // Parameterized constructor
    ParameterizedConstructor(int n, String s) {
        System.out.println("Parameterized Constructor called.");
        num = n;
        str = s;
    }

    public static void main(String[] args) {
        // Create an object using the parameterized constructor
        ParameterizedConstructor object = new ParameterizedConstructor(10, "Hello, World!");

        // Print values of object properties
        System.out.println("num = " + object.num);
        System.out.println("str = " + object.str);
    }
}