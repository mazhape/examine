package JavaAPIandarrays.equalsmethod;

public class EqualsTest {
    public boolean equals(Object anObject) {
        if (this == anObject) {//1 Returns true if the object being compared to is the same object
            return true;
        }
        if (anObject instanceof String) {//2 Executes statements in if construct if anObject is of type String
            String anotherString = (String) anObject;
            int n = count;
            if (n == anotherString.count) {//3 Continues comparison if the length of String values d being compared is equal
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = offset;
                int j = anotherString.offset;

                while (n-- != 0) {//4 Compares individual String characters; returns false if there’s a mismatch with any individual String character
                    if (v1[i++] != v2[j++])
                        return false;
                }
                return true;//5 Returns true if all characters of String anObject successfully matched with this object
            }
        }
        return false;//6 Returns false if the object being compared to is not of type String or the lengths of the compared Strings don’t match
    }
}

//1 compares the object reference variables. If the reference variables are the
//same, they refer to the same object.
//■ 2 compares the type of the method parameter to this object. If the method
//parameter passed to this method is not of type String, 6 returns false.
//■ 3 checks whether the lengths of the String values being compared are equal.
//■ 4 compares the individual characters of the String values. It returns false if a
//mismatch is found at any position. If no mismatch is found, 5 returns true.