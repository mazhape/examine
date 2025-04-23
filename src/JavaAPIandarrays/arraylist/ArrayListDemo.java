package JavaAPIandarrays.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements
        System.out.println(fruits.get(1)); // prints "Banana"

        // Removing an element
        fruits.remove("Apple");

        // Size of the list
        System.out.println(fruits.size()); // prints 2

        // Check if list is empty
        System.out.println(fruits.isEmpty()); // prints false

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);   // Adds 10
        numbers.add(20);   // Adds 20
        numbers.add(30);   // Adds 30

        numbers.remove(1); // Removes the element at index 1, which is 20

        System.out.println(numbers.size());  // prints 2 because 20 was removed
        System.out.println(numbers.get(1)); // prints 30 because after removal, 30 is now at index 1

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");   // index 0 → "Java"
        list.add("OCA");    // index 1 → "OCA"
        list.remove("Java"); // removes the element "Java" by value
        System.out.println(list.get(0)); // Now "OCA" is at index 0


    }
}


//Basic Operations of ArrayList:

//Creation:
//ArrayList<Type> list = new ArrayList<Type>(); // Type can be Integer, String, etc.

//Adding elements:
//list.add(element);   // Adds an element to the end of the list
//list.add(1, element); // Adds an element at index 1 (inserts it at that position)

//Accessing elements:
//list.get(index); // Retrieves element at a specific index

//Removing elements:
//list.remove(index);     // Removes the element at the specified index
//list.remove(element);   // Removes the first occurrence of the element

//Size:
//list.size(); // Returns the number of elements in the list

//Checking if empty:
//list.isEmpty(); // Returns true if the list has no elements

//Explanation:
//After numbers.add(10), numbers.add(20), and numbers.add(30): The list is: [10, 20, 30].
//After numbers.remove(1): This removes the element at index 1, which is 20, leaving the list as: [10, 30].
//        numbers.size(): The size of the list is now 2 (since one element was removed).
//        numbers.get(1): After the removal, 30 has shifted to index 1, so numbers.get(1) returns 30.
//
