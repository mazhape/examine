package MethodsAndEncapsulation.objectcreation;

class Exam {
    String name;
    public void setName(String newName) {
        name = newName;
    }
}
class ObjectLife1 {
    public static void main(String args[]) {
        Exam myExam = new Exam(); //1 Object creation
        myExam.setName("OCA Java Programmer 1");//2 Access method
        myExam = null; //3 Set referenced variable to null
        myExam = new Exam();//4 Another object creation
        myExam.setName("PHP");//5 Access method
    }
}

//■ 1 creates a reference variable myExam and initializes it with an object of
//class Exam.
//■ 2 calls method setName on the object referenced by the variable myExam.
//■ 3 assigns a value null to the reference variable myExam such that the object referenced by this variable is no longer accessible through myExam.
//■ 4 creates a new object of class Exam and assigns it to the reference variable
//myExam.
//■ 5 calls method setName on the second Exam object, created in method main.


//When e creates another object of class Exam and assigns it to the variable myExam,
//what happens to the first object created by B? Because the first object can no longer
//be accessed using any variable, it’s considered garbage by Java and deemed eligible to
//be sent to the garbage bin by Java’s garbage collector. As mentioned earlier, the garbage collector is a low-priority thread that reclaims the space used by unused or unreferenced objects in Java.