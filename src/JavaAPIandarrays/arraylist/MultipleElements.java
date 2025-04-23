package JavaAPIandarrays.arraylist;

import java.util.ArrayList;

public class MultipleElements {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<String>();
        myArrList.add("One");
        myArrList.add("Two");
        ArrayList<String> yourArrList = new ArrayList<String>();
        yourArrList.add("Three");
        yourArrList.add("Four");
        myArrList.addAll(1, yourArrList);//Add elements of yourArrList to myArrList
        for (String val : myArrList)
            System.out.println(val);
    }

}

//One
//Three
//Four
//Two