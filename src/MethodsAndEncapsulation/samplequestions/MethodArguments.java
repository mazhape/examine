//. Which of the following methods correctly accepts three integers as method
//arguments and returns their sum as a floating-point number?
//a public void addNumbers(byte arg1, int arg2, int arg3) {
// double sum = arg1 + arg2 + arg3;
//}
//b public double subtractNumbers(byte arg1, int arg2, int arg3) {
// double sum = arg1 + arg2 + arg3;
// return sum;
//}
//c public double numbers(long arg1, byte arg2, double arg3) {
// return arg1 + arg2 + arg3;
//}
//d public float wakaWakaAfrica(long a1, long a2, short a977) {
// double sum = a1 + a2 + a977;
// return (float)sum;
//}

package MethodsAndEncapsulation.samplequestions;

public class MethodArguments {
}

//Answer: b, d

//public double subtractNumbers(byte arg1, int arg2, int arg3) {
// double sum = arg1 + arg2 + arg3;
// return sum;
//}

//public float wakaWakaAfrica(long a1, long a2, short a977) {
// double sum = a1 + a2 + a977;
// return (float)sum;
//}

//Explanation: Option (a) is incorrect. The question specifies the method should return a
//decimal number (type double or float), but this method doesn’t return any value.
// Option (b) is correct. This method accepts three integer values that can be automatically converted to an integer: byte, int, and int.
// It computes the sum of these

//integer values and returns it as a decimal number (data type double). Note that the
//name of the method is subtractNumbers, which doesn’t make it an invalid option.
//Practically, you wouldn’t name a method subtractNumbers if it’s adding them. But
//syntactically and technically, this option meets the question’s requirements and is a
//correct option.
// Option (c) is incorrect. This method doesn’t accept integers as the method arguments. The type of the method argument arg3 is double, which isn’t an integer.
// Option (d) is correct. Even though the name of the method seems weird, it
//accepts the correct argument list (all integers) and returns the result in the correct
//data type (float).