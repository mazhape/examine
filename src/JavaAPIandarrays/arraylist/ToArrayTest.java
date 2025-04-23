package JavaAPIandarrays.arraylist;

import java.util.ArrayList;

public class ToArrayTest {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Jan"));
        list.add(new StringBuilder("Feb"));

        Object[] arr = list.toArray();

        arr[0] = new StringBuilder("Dec"); // Reassigning array element
        System.out.println(list.get(0));   // Still prints Jan 👀

        //But if you mutate the shared object?
        ((StringBuilder) arr[1]).append("ruary");
        System.out.println(list.get(1)); // Prints "February" 😮

    }
}


//Changing the array's structure has no impact on the ArrayList
//So what’s going on?
//toArray() returns a new array object that contains references to the same elements in the list.
//But! The ArrayList does not keep any reference to this returned array.
//So… if you modify the returned array, you don’t affect the ArrayList, and vice versa (except for the shared mutable objects inside).