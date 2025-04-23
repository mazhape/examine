package JavaAPIandarrays.Sampleexamquestions;

import java.util.*; // line 1
class EJavaGuruArrayList { // line 2
    public static void main(String args[]) { // line 3
        ArrayList<String> ejg = new ArrayList<>(); // line 4
        ejg.add("One"); // line 5
        ejg.add("Two"); // line 6
        System.out.println(ejg.contains(new String("One"))); // line 7
        System.out.println(ejg.indexOf("Two")); // line 8
        ejg.clear(); // line 9
        System.out.println(ejg);
        System.out.println(ejg.get(1)); // line 11
    } // line 12
}

//Line 7 prints true.
//Line 8 prints 1.
//Line 9 removes all elements of the list ejg
//Line 10 prints [].
//Line 11 throws an exception.