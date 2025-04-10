package MethodsAndEncapsulation.LocalVariable;

public class BooleanTest {
    boolean isPrime(int num) {//Method parameter num
        if (num <= 1) return false;
        boolean result = true;//Local variable result
        for (int ctr = num-1; ctr > 1; ctr--) { //Local variable ctr
            if (num%ctr == 0) result = false;
        }
        return result;
    }
}
