package MethodsAndEncapsulation.garbagecollection;

class Exam {
    private String name;
    private Exam other;
    public Exam(String name) {
        this.name = name;
    }
    public void setExam(Exam exam) {
        other = exam;
    }
}
class IslandOfIsolation {
    public static void main(String args[]) {
        Exam php = new Exam("PHP");//1.Initialize variable php
        Exam java = new Exam("Java");//2. Initialize variable java
        php.setExam(java);//3.Assign object referred by java to php.exam
        java.setExam(php);//4 Assign object referred by  php to java.exam
        php = null;//5. assign null to php
        java = null;//6 assign null to java
    }
}


// At 1 and 3, two variables, php and java, are created and initialized using Exam instances. At 3, java is assigned to php.other. At 4, php is assigned
//to java.other. At 5, when php is set to null, the instance referred to by it isn’t eligible for garbage collection because it can still be referenced using java.other. At 6,
//when java is also set to null, both the objects referred to by java and php become eligible for garbage collection. A