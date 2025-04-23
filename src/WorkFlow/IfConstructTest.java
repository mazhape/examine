package WorkFlow;

public class IfConstructTest {
    public static void main(String[] args) {
        if (name.equals("Lion"))
            score = 200;
        name = "Larry"; // ← This is not part of the if-block!
else
        score = 129;

    }
}


//Because there are no braces, only score = 200; is part of the if.
//name = "Larry"; is always executed, regardless of the if.
//But then else has no matching if, because the compiler thinks the if ended right after score = 200;.

//if (name.equals("Lion")) {
//    score = 200;
//    name = "Larry";
//} else {
//    score = 129;
//}