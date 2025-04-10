package MethodsAndEncapsulation.objectfield.exam;

public class Student {
    String name;

    // Setter (write)
    public void setName(String newName) {
        name = newName;
    }

    // Getter (read)
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Alice");                  // ✅ Writing using method
        System.out.println(s.getName());     // ✅ Reading using method
    }
}


// Read and write object fields
//The OCA Java SE 8 Programmer I exam will test you on how to read values from and
//write them to fields of an object, which can be accomplished by any of following:
//■ Using methods to read and write object fields
//■ Using constructors to write values to object fields
//■ Directly accessing instance variables to read and write object fields


//1.Using Methods (Getters and Setters)