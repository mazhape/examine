package MethodsAndEncapsulation.initializer;

class Employee {
    Employee() {//Constructor
        System.out.println("Employee:constructor");
    }
    {
        System.out.println("Employee:initializer");//Initializer block
    }
}
public class TestEmp {
    public static void main(String args[]) {
        Employee e = new Employee();  //Creates an object of class Employee; calls both the initializer block and theconstructor
    }
}


//Employee:initializer
//Employee:constructor