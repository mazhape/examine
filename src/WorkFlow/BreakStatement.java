package WorkFlow;

public class BreakStatement {
    public static void main(String[] args) {
//        String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
//        for (String name : programmers) {
//            System.out.println(name);
//        }
        String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
        for (String name : programmers) {
            if (name.equals("Shreya"))
                break;
            System.out.println(name);//Paul
        }
    }
}

//Paul
//Shreya
//Selvan
//Harry