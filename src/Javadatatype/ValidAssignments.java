package Javadatatype;

public class ValidAssignments {
    public static void main(String[] args) {
        // Valid assignments within same type families
        int a = 10;            // Valid
        double b = a;           // Valid (widening conversion)
        float c = 3.14f;        // Valid
        char d = 'A';           // Valid
        boolean e = true;       // Valid

        // Valid compound assignments within numeric types
        int x = 5;
        x += 3.5;               // Valid (result is 8, truncated)

        double y = 10.0;
        y *= 2;                 // Valid (result is 20.0)
    }
}


//Key Exam Points:
//boolean values cannot be assigned to numeric types or vice versa
//
//Numeric types can be assigned within their family with proper type conversion
//
//Compound assignment operators follow the same type compatibility rules
//
//The compiler will catch these type mismatches during compilation
