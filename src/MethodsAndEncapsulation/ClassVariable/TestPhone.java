package MethodsAndEncapsulation.ClassVariable;

class Phone {
    static boolean softKeyboard = true;//Class variable softKeyboard
}
class TestPhone {
    public static void main(String[] args) {
        Phone.softKeyboard = false;//Accesses the class variable by using the name of the class. It can be accessed even before any of the class’s objects exist.
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        System.out.println(p1.softKeyboard);//Prints false. A class variable can be read by using objects of the class.
        System.out.println(p2.softKeyboard);// prints false
        p1.softKeyboard = true;//A change in the value of this variable will be reflected when the variable is accessed via objects or class name.
        System.out.println(p1.softKeyboard);//prints true
        System.out.println(p2.softKeyboard);//prints true
        System.out.println(Phone.softKeyboard);//prints true
    }
}
