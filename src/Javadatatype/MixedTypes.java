package Javadatatype;

public class MixedTypes {
    public static void main(String[] args) {
        long l = 100L;
        float f = 10.5f;
        double d = 20.5;

        double result = l + f * d;
        System.out.println(result);
    }
}

// 315.25


//f * d
//float * double → float is widened to double, result is double
//10.5 * 20.5 = 215.25 (as a double)
//l + (double)
//long + double → long is widened to double, result is double
//100 + 215.25 = 315.25

//Key Type Promotions in Action:
//float * double → double
//long + double → double
//Final result assigned to a double → ✅ no cast needed