package MethodsAndEncapsulation.overloadedmethod;

class MyClass {
    double calcAverage(double marks1, int marks2) {//Method parameters: double and int
        return (marks1 + marks2)/2.0;
    }
    double calcAverage(int marks1, double marks2) {//Method parameter int and double
        return (marks1 + marks2)/2.0;
    }
    public static void main(String args[]) {
        MyClass myClass = new MyClass();
        myClass.calcAverage(2, 3);//Compiler can’t determine which overloaded method calcAverage should be called
    }
}

//To fix this, you could:
//Explicitly cast one of the arguments to resolve the ambiguity, e.g.:

//myClass.calcAverage((double)2, 3);  // calls the first method
//// or
//myClass.calcAverage(2, (double)3);  // calls the second method
//Add a third overload that takes two int parameters:

//double calcAverage(int marks1, int marks2) {
//    return (marks1 + marks2)/2.0;
//}