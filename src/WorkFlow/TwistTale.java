package WorkFlow;

public class TwistTale {
    public static void main(String[] args) {
        String result = "1";
        int score = 10;

        if ((score = score + 10) == 100)         // score becomes 20, so false
            result = "A";
        else if ((score = score + 29) == 50)     // score becomes 49, so false
            result = "B";
        else if ((score = score + 200) == 10)    // score becomes 249, so false
            result = "C";
        else
            result = "F";

        System.out.println(result + ":" + score);//F:249

    }
}


//F:249

//Breakdown of execution:
//score = 10
//score = score + 10 → score = 20 → 20 == 100 → false
//score = score + 29 → score = 49 → 49 == 50 → false
//score = score + 200 → score = 249 → 249 == 10 → false
//So the else block runs → result = "F"