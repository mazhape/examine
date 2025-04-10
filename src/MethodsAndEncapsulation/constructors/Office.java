package MethodsAndEncapsulation.constructors;

class Employee {
    String name;//Instance variable
    int age;//Instance variable
    Employee() {
        age = 20;//Initialize age
        System.out.println("Constructor");
    }
}
class Office {
    public static void main(String args[]) {
        Employee emp = new Employee();
        System.out.println(emp.age);//Access and print the value of variable age
    }
}


//Constructor
//20