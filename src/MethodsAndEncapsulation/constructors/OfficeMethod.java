package MethodsAndEncapsulation.constructors;

class EmployeeMethod {
    String name;
    int age;
    EmployeeMethod(int newAge, String newName) {
        name = newName;
        age = newAge;
        System.out.println("Constructor");
    }
}
public class OfficeMethod {
    public static void main(String args[]) {
        EmployeeMethod emp = new EmployeeMethod(30, "Pavni Gupta");
    }
}
