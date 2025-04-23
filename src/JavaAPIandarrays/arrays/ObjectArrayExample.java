package JavaAPIandarrays.arrays;

public class ObjectArrayExample {
    public static void main(String[] args) {
        Object[] objects = new Object[4];
        objects[0] = "Hello";              // String
        objects[1] = 42;                   // int autoboxed to Integer
        objects[2] = new int[]{1, 2, 3};   // int[] is also an Object
        objects[3] = new java.util.Date(); // Any object

        Object[] objArray = new Object[3];
        objArray[0] = "OCA";                  // String
        objArray[1] = 3.14;                   // double → Double (autoboxed)
        objArray[2] = new int[]{1, 2, 3};     // int[] → stored as Object

        System.out.println(objArray[2]);

    }
}

//C. Memory address like [I@1db9742
//What does it print?
//objArray[2] is a reference to an int[].
//
//When you print an array directly, Java calls toString() on it.
//
//For arrays, that default toString() looks like:
//[typeCode@hashcode
//So int[] → [I@hexcode
//String[] → [Ljava.lang.String;@hexcode