//Which of the options are correct for the following code?
package Javadatatype.SampleExamQuestions;

public class Prim { // line 1
    public static void main(String[] args) { // line 2
        char a = 'a'; // line 3
        char b = -10; // line 4
        char c = '1'; // line 5
        integer d = 1000; // line 6
        System.out.println(++a + b++ * c - d); // line 7
    } // line 8
}


//Code at line 4 fails to compile.
//c Code at line 6 fails to compile.
//d Code at line 7 fails to compile.

//Explanation: Option (a) is correct. The code at line 4 fails to compile because you
//can’t assign a negative value to a primitive char data type without casting.
// Option (c) is correct. There is no primitive data type with the name “integer.” The
//valid data types are int and Integer (a wrapper class with I in uppercase).
// Option (d) is correct. The variable d remains undefined on line 7 because its declaration fails to compile on line 6. So the arithmetic expression (++a + b++ * c - d)
//that uses variable d fails to compile. There are no issues with using the variable c of
//the char data type in an arithmetic expression. The char data types are internally
//stored as unsigned integer values and can be used in arithmetic expressions.