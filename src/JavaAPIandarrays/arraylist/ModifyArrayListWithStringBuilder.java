package JavaAPIandarrays.arraylist;

import java.util.ArrayList;
public class ModifyArrayListWithStringBuilder {
    public static void main(String args[]) {
        ArrayList<StringBuilder> myArrList =
                new ArrayList<StringBuilder>();
        myArrList.add(new StringBuilder("One"));
        myArrList.add(new StringBuilder("Two"));
        myArrList.add(new StringBuilder("Three"));
        for (StringBuilder element : myArrList)//Access ArrayList elements and modify them
            element.append(element.length());//Access ArrayList elements and modify them
        for (StringBuilder element : myArrList)
            System.out.println(element);
    }
}

//One3
//Two3
//Three5