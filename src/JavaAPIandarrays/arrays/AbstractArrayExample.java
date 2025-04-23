package JavaAPIandarrays.arrays;

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() { System.out.println("Woof"); }
}

class Cat extends Animal {
    void makeSound() { System.out.println("Meow"); }
}

public class AbstractArrayExample {
    public static void main(String[] args) {
        Animal[] pets = new Animal[2];
        Animal a = new Animal(); // ❌ Error! Can't instantiate abstract class
        pets[0] = new Dog();  // ✅ allowed
        pets[1] = new Cat();  // ✅ allowed

        for (Animal pet : pets) {
            pet.makeSound(); // Polymorphic call
        }
    }
}


//Woof
//Meow