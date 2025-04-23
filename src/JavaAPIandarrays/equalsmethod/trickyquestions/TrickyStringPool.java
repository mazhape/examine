package JavaAPIandarrays.equalsmethod.trickyquestions;

public class TrickyStringPool {
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("Hello");

        System.out.println(a == b);//false  // different references
        System.out.println(a.equals(b));//true   // same content

        // Example 2: Interning saves the day

        String a1 = "World";
        String b1 = new String("World").intern();

        System.out.println(a1 == b1);//true  // because b1 is interned, it points to the string pool

        // Example 3: Concatenation with variables vs literals
        String x = "Ja";
        String y = "va";
        String z = "Java";
        String result = x + y;

        System.out.println(z == result); //false // result is computed at runtime — not in the pool
        System.out.println(z.equals(result));//true // content is equal

       //Example 4: Final twist
        final String x1 = "Ja";
        final String y1 = "va";
        String z1 = "Java";
        String result1 = x + y;

        System.out.println(z1 == result1);//true  // compiler inlines final vars, so it's treated like "Java"

        //🔍 Example 5: Case confusion
        String ay = "hello".toUpperCase();
        String by = "HELLO";

        System.out.println(ay == by);//false  // new String returned by toUpperCase()
        System.out.println(ay.equals(by));//true   // content is equal

        String s1 = "Test";
        String s2 = new String("Test");
        System.out.println(s1 == s2);      // false
        System.out.println(s1.equals(s2)); // true ✅
       // Explanation:
        //new String("Test") creates a new object in heap.
        //So == → false (different references), but .equals() checks content → true.

        String as = "Go";
        String bs = "Go";
        String cs = new String("Go").intern();
        //A. a == b → true (same literal from string pool)
        //B. a == c → true (c is interned → points to pool)
        //C. b == c → true (same pool reference)
        //D. a.equals(c) → true

        //Question 3
        String part1 = "Learn";
        String part2 = "Java";
        String full = "LearnJava";
        String joined = part1 + part2;
        System.out.println(full == joined);       // false
        System.out.println(full.equals(joined));  // true ✅

        //part1 + part2 happens at runtime, so it's a new object (not pooled)

        //Question4
        final String x2 = "Pro";
        final String y2 = "gramming";
        String z2 = "Programming";
        String result2 = x2 + y2;
        System.out.println(z2 == result2); // true ✅

      // Explanation: x + y gets compiled as "Programming" since both are final, so compiler optimizes and places it in pool.

        //Question 5
        String a3 = "abc";
        String b3 = "a" + "b" + "c";
        System.out.println(a3 == b3); // true ✅
       //Explanation: all parts are literals, so compiler joins them at compile time, and both refer to same string pool entry.
    }
}
