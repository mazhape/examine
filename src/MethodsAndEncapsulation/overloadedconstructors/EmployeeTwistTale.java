//Let’s modify the definition of the class Employee that I used in the section on overloaded constructors, as follows:
//class Employee {
// String name;
// int age;
// Employee() {
// this ();
// }
// Employee (String newName, int newAge) {
// name = newName;
// age = newAge;
// }
//}
//Question: What is the output of this modified code, and why?
package MethodsAndEncapsulation.overloadedconstructors;

public class EmployeeTwistTale {
    String name;
    int age;

    EmployeeTwistTale() {
        this("Unknown", 0);  // ✅ calls other constructor
    }

    EmployeeTwistTale(String newName, int newAge) {
        name = newName;
        age = newAge;
        System.out.println("Employee created: " + name + ", " + age);
    }

    public static void main(String[] args) {
        new Employee(); // Output: Employee created: Unknown, 0
    }
}
