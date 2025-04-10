package MethodsAndEncapsulation.InstanceVariable;

public class Student {
    // Instance variables
    String name;
    int age;
    double marks;

    // Constructor to initialize instance variables
    public Student(String studentName, int studentAge, double studentMarks) {
        name = studentName;
        age = studentAge;
        marks = studentMarks;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Tatendah", 20, 85.5);
        Student s2 = new Student("Alex", 22, 78.2);

        s1.displayInfo(); // Each object has its own instance variable values
        s2.displayInfo();
    }
}

//Name: Tatendah
//Age: 20
//Marks: 85.5
//Name: Alex
//Age: 22
//Marks: 78.2