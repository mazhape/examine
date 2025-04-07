package Javadatatype;

public class NonFinalExample {
    public static void main(String[] args) {
        byte age1 = 10;
        byte age2 = 20;

        byte sum = age1 + age2; // ❌ Compile-time error: possible lossy conversion
        //byte sum = (byte)(age1 + age2); // ✅ With explicit cast

    }
}



//Even though 10 + 20 = 30, and 30 is within byte range, Java plays it safe and promotes the result of byte + byte to int.