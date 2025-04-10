package MethodsAndEncapsulation.LocalVariable;

public class Example {
    public void sayHello() {
        String message = "Hello, World!"; // ← local variable
        System.out.println(message);
    }
}




//📌 Key Points:
//Feature	           Local Variable
//Declared inside	    Method, constructor, or block {}
//Lifetime	            Exists only during method execution
//Access modifier	    Can't use public, private, etc.
//Must be initialized	Compiler won't let you use it uninitialized
//Stored in	            Stack memory