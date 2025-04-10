package MethodsAndEncapsulation.overloadedmethod;

public class Test {

    public void greet(String name) {
        System.out.println("Hello " + name);
    }

    // ✅ This is valid – parameter list is different
    private void greet(String name, int age) {
        System.out.println("Hello " + name + ", age: " + age);
    }

//    public void greet(String name) {
//        System.out.println("Hello " + name);
//    }
//
//    // ❌ Compile-time error: duplicate method
//    // only access modifier differs
//    private void greet(String name) {
//        System.out.println("Hi " + name);
//    }
}

