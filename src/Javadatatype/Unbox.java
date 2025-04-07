package Javadatatype;

import java.util.ArrayList;
import java.util.Iterator;

public class Unbox {
    public static void main(String args[]) {
        ArrayList list = new ArrayList(); // ArrayList to hold Double objects

        // Adding Double objects to the list
        list.add(new Double(12.12D));  // Double object added (boxing)
        list.add(new Double(11.24D));  // Double object added (boxing)

        // Initializing total with 0.0D using Double.valueOf to create a Double object
        Double total = Double.valueOf(0.0D);

        // Iterating over the list using Iterator
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            // Manually unboxing by calling doubleValue() on the Double object
            Double d = (Double) iterator.next(); // Cast from Object to Double
            total = total.doubleValue() + d.doubleValue(); // Unboxing for arithmetic
        }
    }
}


//12.12D and 11.24D