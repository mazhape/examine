package MethodsAndEncapsulation.LocalVariable;

public class MethodParameterExample {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int result = addNumbers(a, b); // passing parameters to the method
        System.out.println("Sum: " + result);

        greetUser("Tatendah"); // method with a String parameter
    }

    // Method with two int parameters
    public static int addNumbers(int num1, int num2) {
        return num1 + num2; // method uses parameters to calculate and return a result
    }

    // Method with a String parameter
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
}



//Sum: 15
//Hello, Tatendah!