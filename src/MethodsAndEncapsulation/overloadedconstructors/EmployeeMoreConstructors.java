package MethodsAndEncapsulation.overloadedconstructors;

public class EmployeeMoreConstructors {
    String name;
    int age;
    EmployeeMoreConstructors() {
    }
    EmployeeMoreConstructors(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
    EmployeeMoreConstructors(String newName, int newAge, boolean create) {
        this();
        this(newName, newAge);//Won’t compile; can’t include calls to multiple constructors in a constructor
        if (create)
            System.out.println(10);
    }
}


//That’s not all: you can’t call a constructor from any other method in your class. None
//of the other methods of the class Employee can invoke its constructor.