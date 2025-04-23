package WorkFlow.Sampleexamquestions;

public class EJavaGuruTest {
    public static void main(String args[]) {
        int num = 20;
        final int num2;
        num2 = 20;
        switch (num) {
            default: System.out.println("default");
            case num2: System.out.println(4);
                break;
        }
    }
}


//Compilation error
//Even though num2 is marked final, it is assigned later, not at declaration. Therefore:
//🔴 num2 is NOT a compile-time constant, and cannot be used as a case label.