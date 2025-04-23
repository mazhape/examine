package JavaAPIandarrays.arraylist;

import java.util.ArrayList;
public class DeleteElementsFromArrayList {
    public static void main(String args[]) {
        ArrayList<StringBuilder> myArrList = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("One");
        StringBuilder sb2 = new StringBuilder("Two");
        StringBuilder sb3 = new StringBuilder("Three");
        StringBuilder sb4 = new StringBuilder("Four");
        myArrList.add(sb1);
        myArrList.add(sb2);
        myArrList.add(sb3);
        myArrList.add(sb4);
        myArrList.remove(1);//Removes element at position 1
        for (StringBuilder element:myArrList)
            System.out.println(element);//Prints One,Three, and Four
        myArrList.remove(sb3);//Removes Three from list
        myArrList.remove(new StringBuilder("Four"));//Doesn’t removeFour
        System.out.println();
        for (StringBuilder element : myArrList)
            System.out.println(element);//Prints One and Four
    }
}

//One
//Three
//Four
//One
//Four