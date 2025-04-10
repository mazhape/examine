package MethodsAndEncapsulation;

class VariableScopeDemo {

    // Instance variable
    int instanceVar;

    // Class (static) variable
    static int classVar;

    // Method using method parameters and local variables
    void calculateSum(int num1, int num2) {  // Method parameters
        int localSum = num1 + num2;          // Local variable
        instanceVar = localSum;              // Assigning to instance variable
        classVar += localSum;                // Updating class variable

        System.out.println("Local sum: " + localSum);
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Class variable: " + classVar);
    }

    public static void main(String[] args) {
        VariableScopeDemo obj1 = new VariableScopeDemo();
        VariableScopeDemo obj2 = new VariableScopeDemo();

        obj1.calculateSum(10, 20);  // First object updates values
        obj2.calculateSum(5, 15);   // Second object also updates classVar

        System.out.println("obj1.instanceVar = " + obj1.instanceVar);  // 30
        System.out.println("obj2.instanceVar = " + obj2.instanceVar);  // 20
        System.out.println("Shared classVar = " + VariableScopeDemo.classVar);  // 50
    }
}


//Local sum: 30
//Instance variable: 30
//Class variable: 30
//Local sum: 20
//Instance variable: 20
//Class variable: 50
//obj1.instanceVar = 30
//obj2.instanceVar = 20
//Shared classVar = 50

//Summary of Scopes in the Example:
//Variable Type     	Scope	                Example
//Local Variable	  Inside a method	         localSum
//Method Parameter	  Passed into method	     num1, num2
//Instance Variable	  Specific to an object	     instanceVar
//Class Variable	  Shared across all objects	 classVar