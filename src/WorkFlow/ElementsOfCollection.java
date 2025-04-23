package WorkFlow;

import java.util.ArrayList;

public class ElementsOfCollection {
    public static void main(String[] args) {
        ArrayList<StringBuilder> myList= new ArrayList<>();
        myList.add(new StringBuilder("One"));
        myList.add(new StringBuilder("Two"));
        for (StringBuilder val : myList)
            System.out.println (val);
        for (StringBuilder val : myList)
            val = null;
        for (StringBuilder val : myList)
            System.out.println(val);
    }
}

//One
//Two
//One
//Two