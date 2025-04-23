package WorkFlow.Sampleexamquestions;

class EJavaGuru4 {
    public static void main(String args[]) {
        boolean myVal = false;
        if (myVal=true)//This is not a comparison (==), it's an assignment (=)!
            for (int i = 0; i < 2; i++) System.out.println(i);
        else System.out.println("else");
    }
}

//0
//1

//Control Flow:
//
//The if condition is always true because of the assignment
//
//The else block will never execute
//
//The for loop is the statement controlled by the if
//
//Code Structure:
//
//The indentation might be misleading - the for loop is actually the single statement that executes when the if is true
//
//There are no curly braces for the if block, so only the immediately following statement is controlled