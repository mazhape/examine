package Javadatatype;

public class ShortCircuitOperators {
    public static void main(String[] args) {
        int marks = 8;
        int total = 10;
        System.out.println(total < marks && ++marks > 5);//false
        System.out.println(marks);//prints 8
        System.out.println(total == 10 || ++marks > 10);//true
        System.out.println(marks);//prints 8
    }
}


//In the first print statement B, because the first condition, total < marks, evaluates to
//false, the next condition, ++marks > 5, isn’t even evaluated. As you can see c, the
//output value of marks is still 8 (the value to which it was initialized on line 1)! Similarly, in the next comparison d, because total == 10 evaluates to true, the second
//condition, ++marks > 10, isn’t evaluated. Again, this can be verified when the value of
//marks is printed again e, and the output is 8