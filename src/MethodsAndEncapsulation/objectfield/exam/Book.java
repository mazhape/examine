package MethodsAndEncapsulation.objectfield.exam;

public class Book {
    String title;

    // Constructor sets (writes) the field
    public Book(String bookTitle) {
        title = bookTitle;
    }

    public static void main(String[] args) {
        Book b = new Book("Java Basics");   // ✅ Writing using constructor
        System.out.println(b.title);        // ✅ Reading directly (allowed, not best practice)
    }
}



//✅ 2. Using Constructors (Write Only)
//Constructors can initialize (write to) fields when the object is created.