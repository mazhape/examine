package WorkFlow;

public class TwistTaleBreak {
    public static void main(String[] args) {
        String[] programmers = {"Outer", "Inner"};
        for (String outer : programmers) {
            for (String inner : programmers) {
                if (inner.equals("Inner"))
                    break;
                System.out.print(inner + ":");
            }
        }
    }
}

//Outer:Outer: