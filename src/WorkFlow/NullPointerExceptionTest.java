package WorkFlow;

public class NullPointerExceptionTest {
    public static void main(String[] args) {
        String day = null;

        switch (day) {  // This will throw a NullPointerException
            case "MON":
                System.out.println("Monday");
                break;
            case "TUE":
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        Integer num = null;

        switch (num) {  // This will throw a NullPointerException
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Invalid number");
        }


    }
}
