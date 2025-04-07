package Javadatatype;

public class CompareReferences {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);   // new object
        Integer i2 = new Integer(10);   // new object
        Integer i3 = Integer.valueOf(10); // uses cache
        Integer i4 = Integer.valueOf(10); // same cached object as i3
        Integer i5 = 10;                 // autoboxed → valueOf(10)
        Integer i6 = 10;                 // autoboxed → valueOf(10)


        System.out.println(i1 == i2);//false
        System.out.println(i3 == i4);//true
        System.out.println(i4 == i5);
        System.out.println(i5 == i6);
        System.out.println(i1.equals(i2));
        System.out.println(i3.equals(i4));
        System.out.println(i4.equals(i5));
        System.out.println(i5.equals(i6));
    }
}

//false   // i1 == i2
//true    // i3 == i4
//true    // i4 == i5
//true    // i5 == i6
//true    // i1.equals(i2)
//true    // i3.equals(i4)
//true    // i4.equals(i5)
//true    // i5.equals(i6)