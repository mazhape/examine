package MethodsAndEncapsulation.ClassVariable;

class Employeee {
    static String company = "CodeHub";
}
public class EmployeeNull {
    public static void main(String[] args) {
        Employeee emp = null;

        // Accessing static variable using null reference
        System.out.println(emp.company);  // ✅ No exception!
        System.out.println(Employee.company); // ✅ Preferred way
    }
}


//CodeHub
//CodeHub