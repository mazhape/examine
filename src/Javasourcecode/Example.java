package Javasourcecode;

class Example {
    int instanceVar = 10; // Instance variable
    static int staticVar = 20; // Static variable

    static void staticMethod() {
        System.out.println(staticVar); // ✅ Allowed (static to static)
       // System.out.println(instanceVar); // ❌ Compilation Error!
    }

    void instanceMethod() {
        System.out.println(instanceVar); // ✅ Allowed (instance method can access instance members)
        System.out.println(staticVar);   // ✅ Allowed (instance method can access static members)
    }
}



//EXAM TIP static methods and variables can’t access the instance members
//of a class.