package WorkFlow;

public class ContinueStatement {
    public static void main(String[] args) {
        String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
        for (String name : programmers) {
            if (name.equals("Shreya"))
                continue;
            System.out.println(name);
        }
    }
}

//Paul
//Selvan
//Harry

// it skips the printing step for the array value Shreya. Unlike the break
//statement, continue doesn’t exit the loop—it restarts with the next loop iteration,
//printing the remaining array values (that is, Selvan and Harry).