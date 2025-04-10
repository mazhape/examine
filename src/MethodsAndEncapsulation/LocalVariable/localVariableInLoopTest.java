package MethodsAndEncapsulation.LocalVariable;

public class localVariableInLoopTest {
    public void localVariableInLoop() {
        for (int ctr = 0; ctr < 5; ++ctr) {//Variable ctr is defined within the for loop
            System.out.println(ctr);
        }
        System.out.println(ctr); //Variable ctr isn’t accessible outside the for loop; this line won’t compile.
    }
}
