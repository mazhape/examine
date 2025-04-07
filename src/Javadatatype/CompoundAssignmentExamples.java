package Javadatatype;

public class CompoundAssignmentExamples {
    public static void main(String[] args) {
        // -= operator (subtraction assignment)
        int a = 10;
        a -= 3;  // equivalent to a = a - 3
        System.out.println("After -=: " + a);  // Output: 7

        // += operator (addition assignment)
        int b = 5;
        b += 4;  // equivalent to b = b + 4
        System.out.println("After +=: " + b);  // Output: 9

        // *= operator (multiplication assignment)
        int c = 6;
        c *= 2;  // equivalent to c = c * 2
        System.out.println("After *=: " + c);  // Output: 12

        // /= operator (division assignment)
        int d = 15;
        d /= 3;  // equivalent to d = d / 3
        System.out.println("After /=: " + d);  // Output: 5

        // %= operator (modulus assignment)
        int e = 17;
        e %= 5;  // equivalent to e = e % 5
        System.out.println("After %=: " + e);  // Output: 2 (17 ÷ 5 = 3 with remainder 2)

        // More complex example
        double price = 100.0;
        price *= 1.2;  // Increase price by 20%
        System.out.println("Increased price: " + price);  // Output: 120.0

        // Using with other data types
        String text = "Hello";
        text += " World!";  // String concatenation
        System.out.println(text);  // Output: Hello World!
    }
}
