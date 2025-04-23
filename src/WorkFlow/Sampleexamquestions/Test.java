package WorkFlow.Sampleexamquestions;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        if (a++ > 10) {//false
            System.out.println("true");
        }
        {
            System.out.println("false");
        }
        System.out.println("ABC");
    }
}

//false
//ABC

//Variable Initialization:
//
//int a = 10; → a is set to 10
//
//If Condition Evaluation:
//
//a++ > 10 uses the post-increment operator
//
//First compares a (10) > 10 → false
//
//Then increments a to 11 (but the comparison already happened)
//
//If Block:
//
//Since the condition evaluated to false, the System.out.println("true"); is skipped
//
//Independent Block:
//
//The next block { System.out.println("false"); } is just a regular code block (not part of the if statement)
//
//This will execute regardless of the if condition
//
//Final Statement:
//
//System.out.println("ABC"); executes normally