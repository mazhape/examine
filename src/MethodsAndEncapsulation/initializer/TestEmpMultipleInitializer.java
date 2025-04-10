package MethodsAndEncapsulation.initializer;

class Employees {
    {
        System.out.println("Employee:initializer 1");
    }
    Employees() {
        System.out.println("Employee:constructor");
    }
    {
        System.out.println("Employee:initializer 2");
    }
}
public class TestEmpMultipleInitializer {
    public static void main(String args[]) {
        Employees e = new Employees();
    }
}


//Employee:initializer 1
//Employee:initializer 2
//Employee:constructor

//If a class defines multiple initializer blocks, their order of execution depends on their
//placement in a class. But all of them execute before the class’s constructor: