package Javadatatype;

public class FinalConstantExample {
    public static void main(String[] args) {
        final byte age1 = 10;
        final byte age2 = 20;

        byte sum = (byte)(age1 + age2); // You can even skip the cast here
        System.out.println(sum); // Output: 30
    }
}

//30