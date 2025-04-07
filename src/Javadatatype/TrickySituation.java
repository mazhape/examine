package Javadatatype;

public class TrickySituation {
    public static void main(String[] args) {
        Integer obj1 = 100;    // Integer with value 100
        Short obj2 = 100;      // Short with value 100

        System.out.println(obj1.equals(obj2)); // Line 1
        System.out.println(obj1 == obj2);      // Line 2

    }
}

//false   // from obj1.equals(obj2)
//// Compilation error for obj1 == obj2

//Line 1: obj1.equals(obj2)
//obj1 is an Integer and obj2 is a Short.
//
//The equals() method in wrapper classes compares values, but it also checks if the objects are of the same class.
//
//Since Integer and Short are different classes, equals() will return false.
//
//Even though they hold the same value (100), they are of different types (i.e., Integer and Short are incompatible wrapper types).


//Line 2: obj1 == obj2
//== compares references (the object memory locations).
//
//obj1 and obj2 are of different types (Integer and Short), so the compiler will throw an error here.
//
//You can't compare different wrapper class types (e.g., Integer vs. Short) using == in Java.
//
//🚫 Compilation Error: Cannot compare different wrapper classes (Integer and Short) using ==.