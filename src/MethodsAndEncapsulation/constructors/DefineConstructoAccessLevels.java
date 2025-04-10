package MethodsAndEncapsulation.constructors;

public class DefineConstructoAccessLevels {
//    public Constructor
//    Accessible from anywhere.
//        Common for classes that are meant to be widely used.

    public class Book {
        public Book() {
            System.out.println("Public constructor");
        }
    }
//🛡️ 2. protected Constructor
//    Accessible within the same package and by subclasses (even if in different packages).

    public class Animal {
        protected Animal() {
            System.out.println("Protected constructor");
        }
    }
//📦 3. Default (package-private) Constructor
//    No access modifier.
//    Accessible only within the same package.
    public class Car {
        Car() {
            System.out.println("Default constructor");
        }
    }
//🔒 4. private Constructor
//    Accessible only within the same class.
//    Often used in:
//    Singleton pattern
//    Utility classes (like java.lang.Math or Collections)
    public class Singleton {
        private Singleton() {
            System.out.println("Private constructor");
        }

        public static Singleton getInstance() {
            return new Singleton(); // Valid here
        }
    }

}


//OCA Exam Tip:
//Constructors can have all access levels.
//
//They don’t have return types.
//
//You can overload constructors just like methods (different parameter list).
//
//A class can have a private constructor to restrict instantiation.