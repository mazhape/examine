//Which of the following statements will be true if the variable courseName is defined as
//a private variable?

package Javasourcecode.sampleexamquestions;

class Course {
    String courseName;
}
class EJavaaGuru {
    public static void main(String args[]) {
        Course c = new Course();
        c.courseName = "Java";
        System.out.println(c.courseName);
    }
}


//c The class EJavaGuru won’t compile.

//Explanation: If the variable courseName is defined as a private member, it won’t be
//accessible from the class EJavaGuru. An attempt to do so will cause it to fail at compile
//time. Because the code won’t compile, it can’t execute.