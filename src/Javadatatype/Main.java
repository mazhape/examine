package Javadatatype;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Integer obj = null;
        System.out.println(m.increment(obj));  // This will throw a NullPointerException
    }

    public int increment(Integer obj) {
        return ++obj; // Unboxing a null Integer will cause NullPointerException
    }
}

//