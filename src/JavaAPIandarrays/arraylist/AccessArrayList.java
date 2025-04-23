package JavaAPIandarrays.arraylist;

import java.util.ArrayList;
public class AccessArrayList {
    public static void main(String args[]) {
        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("One");
        myArrList.add("Two");
        myArrList.add("Four");
        myArrList.add(2, "Three");
        for (String element : myArrList) {//Code to accessArrayList elements
            System.out.println(element);//Code to accessArrayList elements
        }
    }
}

//One
//Two
//Three
//Four