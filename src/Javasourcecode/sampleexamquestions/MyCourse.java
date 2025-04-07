//A class Course is defined in a package com.ejavaguru. Given that the physical
//location of the corresponding class file is /mycode/com/ejavaguru/Course.class and
//execution takes place within the mycode directory, which of the following lines of
//code, when inserted at // INSERT CODE HERE, will import the Course class into the
//class MyCourse?

package Javasourcecode.sampleexamquestions;

// INSERT CODE HERE
class MyCourse {
    Course c;
}

//import com.ejavaguru.Course;

//Explanation: Option a is incorrect. The base directory, mycode, in which package
//com.ejavaguru is defined, must not be included in the import statement.
// Options c and e are incorrect. The class’s physical location isn’t specified in the
//import statement.
// Options d and f are incorrect. ejavaguru is a package. To import a package and its
//members, the package name should be followed by .*, as follows:
//import com.ejavaguru.*;