package MethodsAndEncapsulation.samplequestions;

class EJava {
    public EJava() {
        this(7);
        System.out.println("public");
    }
    private EJava(int val) {
        this("Sunday");
        System.out.println("private");
    }
    protected EJava(String val) {
        System.out.println("protected");
    }
}
class TestEJava {
    public static void main(String[] args) {
        EJava eJava = new EJava();
    }
}


//The class EJava defines three overloaded constructors
//The code prints the following:
//protected
//private
//public

//Explanation: You can define overloaded constructors with different access modifiers
//in the same way that you define overloaded methods with different access modifiers.
//But a change in only the access modifier can’t be used to define overloaded methods
//or constructors. private methods and constructors are also counted as overloaded
//methods.
// The following line of code calls EJava’s constructor, which doesn’t accept any
//method argument:
//EJava eJava = new EJava();
//The no-argument constructor of this class calls the constructor that accepts an int
//argument, which in turn calls the constructor with the String argument. Because the
//constructor with the String constructor doesn’t call any other methods, it prints
//protected and returns control to the constructor that accepts an int argument.
//This constructor prints private and returns control to the constructor that doesn’t
//accept any method argument. This constructor prints public and returns control to
//the main method.