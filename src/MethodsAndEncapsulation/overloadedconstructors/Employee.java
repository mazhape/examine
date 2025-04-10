package MethodsAndEncapsulation.overloadedconstructors;

class Employee {
    String name;
    int age;
    Employee() {//No-argument constructor
        name = "John";
        age = 25;
    }
    Employee(String newName) { //Constructor with one String argument
        name = newName;
        age = 25;
    }
    Employee(int newAge, String newName) { //Constructor with two arguments—int and String
        name = newName;
        age = newAge;
    }
    Employee(String newName, int newAge) { //Constructor with two arguments—String and int
        name = newName;
        age = newAge;
    }
}