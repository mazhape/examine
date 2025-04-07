//Given the following definition of the class Course,
//package com.ejavaguru.courses;
//class Course {
// public String courseName;
//}
//what’s the output of the following code?
package Javasourcecode.sampleexamquestions;

//import com.ejavaguru.courses.Course;
public class JavaGuru {
    public static void main(String args[]) {
        Course c = new Course();
        c.courseName = "Java";
        System.out.println(c.courseName);
    }
}


//The class JavaGuru won’t compile.
//Explanation: The class will fail to compile because a nonpublic class can’t be accessed
//outside a package in which it’s defined. The class Course therefore can’t be accessed
//from within the class EJavaGuru, even if it’s explicitly imported into it. If the class itself
//isn’t accessible, there’s no point in accessing a public member of a class.