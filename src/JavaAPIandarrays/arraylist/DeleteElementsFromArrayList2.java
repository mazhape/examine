package JavaAPIandarrays.arraylist;

import java.util.ArrayList;
class MyPerson {
    String name;
    MyPerson(String name) { this.name = name; }
    @Override
    public boolean equals(Object obj) {//Method equals
        if (obj instanceof MyPerson) {//null and objects of type other than MyPerson can’t be equal to this object
            MyPerson p = (MyPerson)obj;//Cast obj to MyPerson
            boolean isEqual = p.name.equals(this.name);//Compare name of method parameter to that of this object’s name
            return isEqual;
        }
        else
            return false;
    }
}
}
public class DeleteElementsFromArrayList2 {
    public static void main(String args[]) {
        ArrayList<MyPerson> myArrList = new ArrayList<MyPerson>();
        MyPerson p1 = new MyPerson("Shreya");
        MyPerson p2 = new MyPerson("Paul");
        MyPerson p3 = new MyPerson("Harry");
        myArrList.add(p1);
        myArrList.add(p2);
        myArrList.add(p3);
        myArrList.remove(new MyPerson("Paul"));//Removes Paul
        for (MyPerson element:myArrList)
            System.out.println(element.name);//Prints Shreya and Harry
    }
}
