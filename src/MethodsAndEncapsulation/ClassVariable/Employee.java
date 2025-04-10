package MethodsAndEncapsulation.ClassVariable;

public class Employee {
    // Instance variable
    String name;

    // Class (static) variable
    static String company = "TechCorp";

    // Constructor
    public Employee(String empName) {
        name = empName;
    }

    // Method to display employee info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Company: " + company); // accessing static variable
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Tatendah");
        Employee e2 = new Employee("Alex");

        e1.displayInfo();
        e2.displayInfo();

        // Changing the static variable using class name
        Employee.company = "CodeSolutions";

        System.out.println("\nAfter changing company name:");

        e1.displayInfo();
        e2.displayInfo();
    }
}


//Name: Tatendah
//Company: TechCorp
//Name: Alex
//Company: TechCorp
//
//After changing company name:
//Name: Tatendah
//Company: CodeSolutions
//Name: Alex
//Company: CodeSolutions