package WorkFlow;

public class ElseConstructTest {
    public static void main(String[] args) {
        String name = "Lion";
        if (name.equals("Lion"))
            System.out.println("Lion");
        else
            System.out.println("Not a Lion");
        System.out.println("Again, not a Lion");
    }
}

//Lion
//Again, not a Lion
//if (name.equals("Lion")) evaluates to true, so:
//System.out.println("Lion"); runs ✅
//else block is skipped ❌
//The third System.out.println("Again, not a Lion");
// is NOT part of the else block because no braces {} were used — it always executes.