package MethodsAndEncapsulation.overloadedconstructors;

public class EmployeeThis {
    String name;
    int age;
    EmployeeThis() {
        System.out.println("No-argument constructor");
        this(null, 0);//Won’t compile—the call to the overloaded constructor must be the first statement in a constructor.
    }
    EmployeeThis(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
}
