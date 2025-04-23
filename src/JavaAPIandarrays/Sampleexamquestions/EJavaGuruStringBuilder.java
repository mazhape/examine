package JavaAPIandarrays.Sampleexamquestions;

class EJavaGuruStringBuilder {
    public static void main(String args[]) {
        StringBuilder ejg = new StringBuilder(10 + 2 + "SUN" + 4 + 5);
        ejg.append(ejg.delete(3, 6));
        System.out.println(ejg);
    }
}
//12S512S5
//Explanation: This question tests your understanding of operators, String, and
//StringBuilder. The following line of code returns 12SUN45:
//10 + 2 + "SUN" + 4 + 5
//The + operator adds two numbers but concatenates the last two numbers. When
//the + operator encounters a String object, it treats all the remaining operands as
//String objects.