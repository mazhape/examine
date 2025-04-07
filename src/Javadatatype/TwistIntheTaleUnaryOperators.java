package Javadatatype;

public class TwistIntheTaleUnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        a = ++a + a + --a - --a + a++;
        System.out.println (a);
    }
}
//32