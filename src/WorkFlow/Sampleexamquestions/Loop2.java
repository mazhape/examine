package WorkFlow.Sampleexamquestions;


class Loop2 {
    public static void main(String[] args) {
        int i = 10;
        do
            while (i < 15)//inner loop
                i = i + 20;
        while (i < 2);
        System.out.println(i);
    }
}


//30

//Initialization: i is set to 10
//Outer do-while loop starts (will execute at least once)
//Inner while loop: while (i < 15)
//First iteration: i = 10 (which is < 15)
//Execute body: i = i + 20 → i = 30
//Second iteration: Check i < 15 (30 < 15 is false) → exit inner loop
//Outer loop condition check: while (i < 2)
//i is now 30, so 30 < 2 is false → exit outer loop
//Print statement: Outputs the final value of i (30)