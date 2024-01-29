//Author Name: Nikhil Soni


// Program to find no. of objects created out of a class using ‘static’ modifier.
// Input:   No of objects created
// Output: Display the number of objects created (e.g. no of objects=3)

public class arrayOfObjects {
    
    static int objectCount = 0;
  
    // incrementing the object count
    arrayOfObjects () {
      objectCount++;
    }

    public static void main (String[] args) {
      // here i am creating three objects
      arrayOfObjects obj1 = new arrayOfObjects ();
      arrayOfObjects obj2 = new arrayOfObjects ();
      arrayOfObjects obj3 = new arrayOfObjects ();
  
      // display the number of objects created
      System.out.println ("Number of objects created: " + objectCount);
    }
  }
  