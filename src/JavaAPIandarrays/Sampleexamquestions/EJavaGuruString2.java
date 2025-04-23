package JavaAPIandarrays.Sampleexamquestions;

class EJavaGuruString2 {
    public static void main(String args[]) {
        String ejg = "game".replace('a', 'Z').trim().concat("Aa");
        ejg.substring(0, 2);
        System.out.println(ejg);
    }
}

//b gZmeAa
//Explanation: When chained, methods are evaluated from left to right. The first method
//to execute is replace, not concat. Strings are immutable. Calling the method substring on the reference variable ejg doesn’t change the contents of the variable ejg.
//It returns a String object that isn’t referred to by any other variable in the code. In
//fact, none of the methods defined in the String class modify the object’s own value.
//They all create and return new String objects