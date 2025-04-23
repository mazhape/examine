package JavaAPIandarrays.arraylist;

import java.util.ArrayList;

class MyPersony {
    String name;
    MyPersony(String name) { this.name = name; }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyPersony) {
            MyPersony p = (MyPersony)obj;
            boolean isEqual = p.name.equals(this.name);
            return isEqual;
        }
        else
            return false;
    }
}
public class MiscMethodsArrayList4 {
    public static void main(String args[]) {
        ArrayList<MyPersony> myArrList = new ArrayList<MyPersony>();
        MyPersony p1 = new MyPersony("Shreya");
        MyPersony p2 = new MyPersony("Paul");
        myArrList.add(p1); // index 0
        myArrList.add(p2); // index 1
        myArrList.add(p2); // index 2
        System.out.println(myArrList.contains(new MyPersony("Shreya")));
        System.out.println(myArrList.contains(p1));
        System.out.println(myArrList.indexOf(new MyPersony("Paul")));
        System.out.println(myArrList.indexOf(p2));
        System.out.println(myArrList.lastIndexOf(new MyPersony("Paul")));
        System.out.println(myArrList.lastIndexOf(p2));
    }
}


//true
//true
//1
//1
//2
//2