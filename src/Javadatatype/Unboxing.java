package Javadatatype;

import java.util.ArrayList;

public class Unboxing {
    public static void main(String args[]) {
        ArrayList<Double> list = new ArrayList<Double>(); // list of Double objects

        list.add(12.12); // autoboxing: primitive double → Double
        list.add(11.24); // autoboxing

        Double total = 0.0; // wrapper object (Double), initialized via autoboxing

        for (Double d : list)
            total += d; // unboxing d to double, adding to total (also unboxed internally), result autoboxed back to Double
        System.out.println("Total = " + total);

    }
}


//Total = 23.36