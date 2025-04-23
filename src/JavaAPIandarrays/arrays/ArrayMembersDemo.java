package JavaAPIandarrays.arrays;

public class ArrayMembersDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        System.out.println(numbers.length);       // ✅ prints 4
        System.out.println(numbers[2]);           // ✅ prints 30

        int[] copy = numbers.clone();             // ✅ returns a new int[]
        System.out.println(copy == numbers);      // ❌ false, different array objects

        String[] days = {"Mon", "Tue", "Wed"};
        System.out.println(days.length);        // ✅ This prints 3
        System.out.println(days[1].length());   // ✅ This prints 3 (length of "Tue")

        int[] nums = {10, 20};
        System.out.println(nums[1].length()); // ❌ Compilation error! nums[1] is an int, and primitive types don’t have methods like .length().

    }
}

//Why?
//days.length → is the number of elements in the array → 3
//days[1] → "Tue" → a String object
//"Tue".length() → method of the String class → 3 characters long