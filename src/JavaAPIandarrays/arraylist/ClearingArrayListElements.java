package JavaAPIandarrays.arraylist;

import java.util.ArrayList;

public class ClearingArrayListElements {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<String>();
        myArrList.add("One");
        myArrList.add("Two");
        myArrList.clear();
        for (String val:myArrList)
            System.out.println(val);
    }
}

//won’t print out anything