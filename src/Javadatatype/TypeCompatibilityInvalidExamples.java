//Important Note: You cannot use assignment operators to mix incompatible types,
// particularly between boolean and numeric types (char, byte, int, short, long, float, double)

package Javadatatype;

public class TypeCompatibilityExamples {
    public static void main(String[] args) {
        // Invalid: Cannot assign boolean to numeric types
        int num1 = true;       // Compilation error
        double num2 = false;   // Compilation error
        char letter = true;    // Compilation error

        // Invalid: Cannot assign numeric values to boolean
        boolean flag1 = 1;     // Compilation error
        boolean flag2 = 0;     // Compilation error
        boolean flag3 = 'a';   // Compilation error

        // Invalid compound assignments between incompatible types
        int x = 5;
        x += true;             // Compilation error

        boolean isDone = false;
        isDone += 1;           // Compilation error
    }
}
