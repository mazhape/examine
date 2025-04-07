package Javadatatype;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a > 20 && b > 10);//false
        System.out.println(a > 20 || b > 10);//true
        System.out.println(! (b > 10));//false
        System.out.println(! (a > 20));//true
    }
}



//B prints false because both of the conditions, a > 20 and b > 10, are not true. The
//first one (a > 20) is false. c prints true because one of these conditions (b > 10) is
//true. d prints false because the specified condition, b > 10, is true. e prints true
//because the specified condition, a > 20, is false.