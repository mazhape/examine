package JavaAPIandarrays.arraylist;

import java.util.ArrayList;

public class TestList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");   // index 0
        colors.add("Green"); // index 1
        colors.add("Blue");  // index 2
        colors.remove(1);    // removes "Green" at index 1
        System.out.println(colors); // prints [Red, Blue]

        ArrayList<String> list = new ArrayList<>();
        list.add("1");   // index 0
        list.add("2");   // index 1
        list.remove(1);  // removes the element at index 1 → "2" is gone
         // list = ["1"]
        list.remove("1"); // removes the element "1" by value
         // list = []

        System.out.println(list); //[]

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1); // index 0
        nums.add(2); // index 1
        nums.remove(1); // removes the element at index 1 (i.e., the value 2)

        System.out.println(nums);//[1]
    }
}

