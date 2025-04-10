package MethodsAndEncapsulation.LocalVariable;

public class LocalScopeTest {
    public static void main(String[] args) {
        int x = 10;

        if (x > 5) {
            int y = 20;
            System.out.println("x + y = " + (x + y));
        }

        // What happens here?

         System.out.println("y is " + y);
    }
}

// Compile-time error
//y is a local variable declared inside the if block. It doesn't exist outside that block, so trying to access it after the block causes a compilation failure:
//error: cannot find symbol.