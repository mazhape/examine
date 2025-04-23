package JavaAPIandarrays.Sampleexamquestions;

import java.util.*;
public class TestClass {
    public static void main(String[] args) throws Exception {
        List list = new ArrayList();
        list.add("val1"); //1
        list.add(2, "val2"); //2
        list.add(1, "val3"); //3
        System.out.println(list);
    }
}

//It will throw an exception at run time because of line //2
//This line is trying to put a value in an ArrayList at index 2 (i.e. 3rd position).
// To be able to put a value at index 2, the ArrayList must have atleast 2 values already.
// Therefore, it will throw java.lang.IndexOutOfBoundsException exception.
//It will throw an exception at run time because of line //2
//This code will throw a java.lang.IndexOutOfBoundsException at runtime on line 2
//You're calling list.add(2, "val2") when the list only has one element (at index 0):
//list.add("val1"); → list becomes: ["val1"] (size is now 1)
//list.add(2, "val2"); → you're trying to insert at index 2, but that's invalid because:
//Valid indices for insertion are 0 to 1 at this point (inclusive)
//Index 2 is out of bounds

//import java.util.*;
//public class TestClass {
//    public static void main(String[] args) throws Exception {
//        List list = new ArrayList();
//        list.add("val1");         // ["val1"]
//        list.add(1, "val2");      // ["val1", "val2"]
//        list.add(1, "val3");      // ["val1", "val3", "val2"]
//        System.out.println(list);
//    }
//}