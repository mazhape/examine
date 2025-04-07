package Javadatatype.SampleExamQuestions;

public class WrapperTest {
    public static void main(String[] args) {
        Boolean buy = new Boolean(true);
        Boolean sell = new Boolean(true);
        System.out.print(buy == sell);
        boolean buyPrim = buy.booleanValue();
        System.out.print(!buyPrim);
        System.out.print(buy && sell);
    }
}


//falsefalsetrue
//Explanation: The Boolean instances buy and sell are created using constructors.
//Constructors don’t refer to existing instances in cache; they create new instances.
//Because the comparison operator == compares object references and not the primitive value stored by a wrapper instance, buy == sell returns false.
// The method booleanValue() can be used to get the primitive boolean value
//stored by a Boolean wrapper instance. So buy.booleanValue() returns false. Because
//wrapper instances can be used with arithmetic and logical operators, buy && sell compiles, returning true