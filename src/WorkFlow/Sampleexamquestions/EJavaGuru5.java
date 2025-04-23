package WorkFlow.Sampleexamquestions;

class EJavaGuru5 {
    public static void main(String args[]) {
        int i = 0;
        for (; i < 2; i=i+5) {
            if (i < 5) continue;
            System.out.println(i);
        }
        System.out.println(i);
    }
}

//5

//🧠 Step-by-step Execution:
//int i = 0;
//Variable i is initialized to 0.
//for (; i < 2; i = i + 5)
//No initialization (already done), condition is i < 2
//Loop body runs as long as i < 2
//🔁 First Iteration:
//i = 0, i < 2 → ✅ true
//Inside the loop:
//if (i < 5) → 0 < 5 → ✅ true
//continue; is executed → skips the rest of the loop body (no print), goes to update step
//Update: i = i + 5 → i = 0 + 5 = 5
//🔁 Second Iteration:
//i = 5, i < 2 → ❌ false
//→ loop ends