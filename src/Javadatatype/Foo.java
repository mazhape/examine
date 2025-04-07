package Javadatatype;

public class Foo {
    public static void main (String args[]) {
        boolean b1, b2, b3, b4, b5, b6; // line 1
        b1 = b2 = b3 = true; // line 2
        b4 = 0; // line 3 0 is an int, and cannot be assigned to a boolean.
        b5 = 'false'; // line 4 'false' is not a valid char — it contains more than one character.
        b6 = yes; // line 5 yes is not a recognized boolean literal (true or false) and not a declared variable.
    }
}
