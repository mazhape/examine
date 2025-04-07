package Javadatatype;

public class WrapperImmutability {
    public static void main(String[] args) {
        Integer num = 10; // 'num' points to an Integer object holding value 10
        num += 5; // This creates a new Integer object with value 15

        System.out.println("num = " + num); // Prints: num = 15
    }
}



//This rule is important because:
//
//Wrapper classes are immutable: You cannot directly change the value of a Wrapper object. Any attempt to modify it creates a new object.
//
//When performing arithmetic operations (like +=, -=), a new object is created, and the reference is updated.
//
//This concept is essential for understanding how memory management and object references work in Java, especially when dealing with autoboxing and unboxing.