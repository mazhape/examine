package WorkFlow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LimitationsOfEnhancedForLoop {
    public static void main(String[] args) {
        //🚫 1. Cannot be used to initialize or modify array elements
        int[] nums = new int[3];
        for (int num : nums) {
            num = 10;  // Changes only the copy, not the array
        }
        System.out.println(Arrays.toString(nums)); // [0, 0, 0]

        //✅ Use classic for loop:
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 10;
        }


        //🚫 2. Cannot be used to delete or remove elements from a collection
        List<String> names = new ArrayList<>(Arrays.asList("Tom", "Jerry", "Spike"));
        for (String name : names) {
            if (name.equals("Jerry")) {
                names.remove(name);  // Runtime error!
            }
        }

        //✅ Use an Iterator
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals("Jerry")) {
                iter.remove();  // Safe
            }
        }

        //🚫 3. Cannot iterate over multiple collections or arrays at once
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        for (int x : a, y : b) {  // ❌ Not allowed!
            System.out.println(x + y);
        }

        //✅ Use index-based loop:
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + b[i]);
        }

    }
}
