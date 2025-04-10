package MethodsAndEncapsulation.objectfield.primitivestomethods;

class Employee {
    int age;
    void modifyVal(int a, int age) { //Method modifyVal accepts method argument of type int
        a = a + 1;
        age = age + 1;
        System.out.println(a);
        System.out.println(age);
    }
}
class Office {
    public static void main(String args[]) {
        Employee e = new Employee();
        System.out.println(e.age);//Prints 0
        e.modifyVal(e.age); //Calls method modifyVal on an object of class Employee
        System.out.println(e.age);//Prints 0
    }
}

//0
//1
//0


//The class Office will still print the same answer because the method modifyVal
//defines a method parameter with the name age
//Note the following important points
//related to passing a method parameter to a method:
//■ It’s OK to define a method parameter with the same name as an instance variable (or object field). But this is not a recommended practice.
//■ Within a method, a method parameter takes precedence over an object field.
//When the method modifyVal refers to the variable age, it refers to the method
//parameter age, not the instance variable age. To access the instance variable
//age within the method modifyVal, the variable name age needs to be prefixed
//with the keyword this (this is a keyword that refers to the object itself).