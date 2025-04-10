package MethodsAndEncapsulation.objectfield;

public class EmployeePrivate {
    private String name; //Object field with private access
    int age; //Non private object field
    EmployeePrivate() {
        age = 22; //Assign value to age
    }
    public void setName(String val) {
        name = val;////Assign value to name
    }
    public void printEmp() {
        System.out.println("name = " + name + " age = " + age);
    }
}


//You won’t be able to set the value of the object field name as follows:
//e1.name = "Selvan";
//This line of code won’t compile. Instead, it complains that the variable name has private access in the class Employee and can’t be accessed from any other class:
//Office.java:6: name has private access in Employee
// e1.name = "Selvan";