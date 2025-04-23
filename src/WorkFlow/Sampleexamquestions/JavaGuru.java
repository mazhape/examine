package WorkFlow.Sampleexamquestions;


class JavaGuru {
    public static void main(String args[]) {
        int num = 120;
        switch (num) {
            default: System.out.println("default");
            case 0:               // valid
            case 10*2-20:         // also valid, because 10*2 - 20 = 0 → same as case 0
                break;
        }
    }
}


//Compilation error

//⚠️ Both case 0 and case 10*2-20 evaluate to the same value → duplicate case labels.
//❌ Compilation Error:
//"Duplicate case label"
//Because both case 0: and case 10*2-20: resolve to case 0:, the compiler throws an error.
//✅ How to Fix:
//Change one of the case values so they’re not the same:
//case 0: System.out.println("case1");
//case 10*2-10: System.out.println("case2"); // Now this is case 10