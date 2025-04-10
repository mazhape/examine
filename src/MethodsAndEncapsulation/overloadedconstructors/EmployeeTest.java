package MethodsAndEncapsulation.overloadedconstructors;

public class EmployeeTest {
    String name;
    int age;
    EmployeeTest() { //No-argument constructor
        this(null, 0);//Invokes constructor that accepts two  method arguments
    }
    EmployeeTest(String newName, int newAge) {//Constructor that accepts two method arguments
        name = newName;
        age = newAge;
    }
}


//The code at B creates a no-argument constructor. At c, this constructor calls the
//overloaded constructor by passing to it values null and 0. d defines an overloaded
//constructor that accepts two method arguments