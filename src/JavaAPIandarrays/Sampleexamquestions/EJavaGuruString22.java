package JavaAPIandarrays.Sampleexamquestions;

public class EJavaGuruString22 {
    public static void main(String args[]) {
        String ejg = "game";
        ejg.replace('a', 'Z').trim().concat("Aa");
        ejg.substring(0, 2);
        System.out.println(ejg);
    }
}
//game
//Explanation: String objects are immutable. It doesn’t matter how many methods you
//execute on a String object; its value won’t change. Variable ejg is initialized with the
//String value "game". This value won’t change, and the code prints game.