package MethodsAndEncapsulation.samplequestions;

class EJavaGuruPassPrim {
    public static void main(String args[]) {
        int ejg = 10;
        anotherMethod(ejg);
        System.out.println(ejg);
        someMethod(ejg);
        System.out.println(ejg);
    }
    static void someMethod(int val) {
        ++val;
        System.out.println(val);
    }
    static void anotherMethod(int val) {
        val = 20;
        System.out.println(val);
    }
}


// 20
//10
//11
//10

//Explanation: When primitive data types are passed to a method, the values of the variables in the calling method remain the same. This behavior doesn’t depend on
//whether the primitive values are reassigned other values or modified by addition, subtraction, or multiplication—or any other operation.

//Step-by-Step Execution:
//Step 1: anotherMethod(ejg);
//ejg is 10, passed by value to val
//
//val = 20; — only changes the copy
//
//Prints: 20
//
//Step 2: System.out.println(ejg);
//ejg is still 10
//
//Prints: 10
//
//Step 3: someMethod(ejg);
//ejg is 10, passed by value to val
//
//++val; → becomes 11
//
//Prints: 11
//
//Step 4: System.out.println(ejg);
//ejg is still 10
//
//Prints: 10