package Javadatatype;

public class TypePromotionQuiz {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b); // Line 1
        System.out.println(c);
    }
}


//30

//Explanation:
//a + b → byte + byte gets promoted to int.
//So the expression a + b results in an int.
//Assigning an int to a byte would normally cause a compile-time error, unless explicitly cast.
//That's why the cast (byte) is required and correct.