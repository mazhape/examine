package Javadatatype.SampleExamQuestions;

public class Test {
    public static void main(String[] args) {
        int myChar = 97;
        int yourChar = 98;
        System.out.print((char)myChar + (char)yourChar);
        int age = 20;
        System.out.print(" ");
        System.out.print((float)age);
    }
}


//195 20.0
//Explanation: When a char primitive data type is used as an operand to arithmetic
//operators, its corresponding ASCII value is used in the arithmetic operation. Though
//(char)myChar explicitly casts int variable myChar to char type, its value 97 is used in
//the arithmetic operation. When literal value 20 is explicitly cast to a float type, it outputs its value as a decimal number, that is, 20.0.
//Step 1: Understanding the Characters (myChar and yourChar)
//myChar = 97 and yourChar = 98 are integer values, and they are cast to char.
//
//In Java, char values represent Unicode code points. The number 97 corresponds to the lowercase letter 'a', and 98 corresponds to the lowercase letter 'b'.
//
//When you cast myChar and yourChar to char, they will represent:
//
//(char)myChar → 'a'
//
//(char)yourChar → 'b'
//
//Step 2: The Addition (+) of Two char Values
//The + operator is used between (char)myChar and (char)yourChar. In Java, when you perform arithmetic operations on char values, they are promoted to int. This means the ASCII (Unicode) values of the characters will be used.
//
//'a' + 'b' will be evaluated as:
//
//'a' → ASCII value 97
//
//'b' → ASCII value 98
//
//So, 'a' + 'b' will be 97 + 98 = 195.
//
//Since you are performing the addition of two char values, the result is an int (195), not a char. So, the output of System.out.print((char)myChar + (char)yourChar); will be 195.
//
//Step 3: Printing the Age
//You declare an integer age = 20 and then print it as a float:
//
//(float)age will convert 20 (an int) to 20.0 (a float).
//
//System.out.print((float)age) will print 20.0.