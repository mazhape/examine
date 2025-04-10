package MethodsAndEncapsulation.defaultconstructor;

class Employee {//No constructor is defined in class Employee.
    String name;
    int age;
    Employee(int newAge, String newName) {//User-defined constructor
        name = newName;
        age = newAge;
        System.out.println("User defined Constructor");
    }
}
class Office {
    public static void main(String args[]) {
        Employee emp = new Employee();//Class Employee doesn’t define a constructor,but this code compiles successfully.
        //Employee emp = new Employee();//Won’t compile
    }
}
