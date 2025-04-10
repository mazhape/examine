package MethodsAndEncapsulation.objectfield;

class Employee {
    String name;//1.Object fields
    int age;//Object fields
    Employee() {
        age = 22;//2. Assign value to age
    }
    public void setName(String val) {
        name = val;//3.Assign value to name
    }
    public void printEmp() {
        System.out.println("name = " + name + " age = " + age);
    }
}

//In the class Employee, 1 defines two object fields: name and age. It defines a (no-argument) constructor.
// And 2 assigns a value of 22 to its field age. This class also defines
//a method setName, where 3 assigns the value passed to it to the object field name