package MethodsAndEncapsulation.constructors;

class EmployeeReturnType {
    void EmployeeReturnType() {
        System.out.println("Constructor");
    }
}
public class OfficeReturnType {
    public static void main(String args[]) {
        EmployeeReturnType emp = new EmployeeReturnType();//Doesn’t call method Employee with return type void
    }
}


//won’t call the method Employee with the return type
//void defined in the class Employee. Because the method Employee defines its return
//type as void, it’s no longer treated as a constructor.