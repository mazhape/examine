package JavaAPIandarrays.arraylist;

import java.util.*;

class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

public class TestZoo {
    public static void main(String[] args) {
        Animal a = new Animal("Lion");

        List<Animal> list1 = new ArrayList<>();
        List<Animal> list2 = new ArrayList<>();

        list1.add(a);
        list2.add(a);

        a.name = "Tiger";

        System.out.println(list1); // ?
        System.out.println(list2); // ?
    }
}


//[Tiger] and [Tiger]
