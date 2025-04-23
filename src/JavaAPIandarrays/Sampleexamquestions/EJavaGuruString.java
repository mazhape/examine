package JavaAPIandarrays.Sampleexamquestions;

class EJavaGuruString {
    public static void main(String args[]) {
        String ejg1 = new String("E Java");
        String ejg2 = new String("E Java");
        String ejg3 = "E Java";
        String ejg4 = "E Java";
        do
            System.out.println(ejg1.equals(ejg2));
        while (ejg3 == ejg4);
    }
}

//true printed in an infinite loop
//Explanation: String objects that are created without using the new operator are placed
//in a pool of Strings. Hence, the String object referred to by the variable ejg3 is
//placed in a pool of Strings. The variable ejg4 is also defined without using the new
//operator. Before Java creates another String object in the String pool for the variable ejg4, it looks for a String object with the same value in the pool. Because this value
//already exists in the pool, it makes the variable ejg4 refer to the same String object.
//This, in turn, makes the variables ejg3 and ejg4 refer to the same String objects.
//Hence, both of the following comparisons will return true:
//■ ejg3 == ejg4 (compare the object references)
//■ ejg3.equals(ejg4) (compare the object values)
//Even though the variables ejg1 and ejg2 refer to different String objects, they define
//the same values. So ejg1.equals(ejg2) also returns true. Because the loop condition
//(ejg3==ejg4) always returns true, the code prints true in an infinite loop.