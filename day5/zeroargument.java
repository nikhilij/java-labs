class zeroargument {
    // Default constructor (0-argument constructor)
    public zeroargument() {
        System.out.println("This is the 0-arguments constructor.");
    }

    public static void main(String[] args) {
        // Creating an instance of the class will invoke the default constructor
        zeroargument exampleObject = new zeroargument();
    }
}