package JavaAPIandarrays.arraylist;

import java.util.ArrayList;

public class MiscMethodsArrayList5 {
    public static void main(String args[]) {
        ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
        StringBuilder sb1 = new StringBuilder("Jan");
        StringBuilder sb2 = new StringBuilder("Feb");
        myArrList.add(sb1); // index 0
        myArrList.add(sb2); // index 1
        myArrList.add(sb2); // index 2
        ArrayList<StringBuilder> assignedArrList = myArrList;//Assigns object referred to by myArrList to assignedArrList
        ArrayList<StringBuilder> clonedArrList =
                (ArrayList<StringBuilder>)myArrList.clone();//Clones myArrList and assigns it to clonedArrList
        System.out.println(myArrList == assignedArrList);
        System.out.println(myArrList == clonedArrList);
        StringBuilder myArrVal = myArrList.get(0);
        StringBuilder assignedArrVal = assignedArrList.get(0);
        StringBuilder clonedArrVal = clonedArrList.get(0);
        System.out.println(myArrVal == assignedArrVal);
        System.out.println(myArrVal == clonedArrVal);
    }
}

//true
//false
//true
//true


//Let’s go through the previous code:
//■ B assigns the object referred to by myArrList to assignedArrList. The variables myArrList and assignedArrList now refer to the same object.
//■ C assigns a copy of the object referred to by myArrList to clonedArrList. The
//variables myArrList and clonedArrList refer to different objects. Because the
//method clone returns a value of the type Object, it’s cast to ArrayList<StringBuilder> to assign it to clonedArrList (don’t worry if you can’t follow this
//line—casting is covered in chapter 6).
//■ D prints true because myArrList and assignedArrList refer to the same object.
//■ E prints false because myArrList and clonedArrList refer to separate objects,
//because the method clone creates and returns a new object of ArrayList (but
//with the same list members).
//■ F proves that the method clone didn’t copy the elements of myArrList. All the
//variable references myArrVal, AssignedArrVal, and clonedArrVal refer to the
//same objects.
//■ Hence, both G and H print true