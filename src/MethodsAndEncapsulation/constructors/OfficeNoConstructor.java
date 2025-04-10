package MethodsAndEncapsulation.constructors;
class Employe {
    void Employe() {
        System.out.println("not a Constructor now");
    }
}
public class OfficeNoConstructor {
    public static void main(String args[]) {
        Employe emp = new Employe();
        emp.Employe();
    }
}

//ype as void, it’s no longer treated as a constructor.
// If the class Employee defines the return type of the method Employee as void, how
//can Java use it to create an object? The method (with the return type void) is treated as
//any other method in the class Employee. This logic applies to all the other data types: if
//you define the return type of a constructor to be any data type—such as char, int,
//String, long, double, or any other class—it’ll no longer be treated as a constructor