package WorkFlow;

public class ValidandInvalidCaseLabels {
    public static void main(String[] args) {
        //❌ Invalid Case Label (Non-constant):
        int x = 10;
        switch (x) {  // Compilation error: case labels must be compile-time constants
            case x:  // This will not compile
                System.out.println("Value is 10");
                break;
            default:
                System.out.println("Default");
        }

        //✅ Valid Case Labels:
        final int x1 = 10;  // This is a compile-time constant
        switch (x1) {
            case 10:  // This is valid
                System.out.println("Value is 10");
                break;
            default:
                System.out.println("Default");
        }
        //Valid Case Labels:
        String day = "MON";
        switch (day) {
            case "MON":
                System.out.println("Monday");
                break;
            case "TUE":
                System.out.println("Tuesday");
                break;
        }

        //final variables:

        final int DAY_MON = 1;
        int day1 = DAY_MON;
        switch (day1) {
            case DAY_MON:  // Valid: DAY_MON is a compile-time constant
                System.out.println("Monday");
                break;
            default:
                System.out.println("Invalid day");
        }

        //Invalid Case Labels:
        //Non-final variable:
        int day2 = 1;
        switch (day2) {
            case day2:  // Error: 'day' is not a compile-time constant
                System.out.println("Monday");
                break;
            default:
                System.out.println("Invalid day");
        }

    //Expression:
         int x = 5;
        switch (x) {
            case (x + 1):  // Error: (x + 1) is not a compile-time constant
                System.out.println("Value is 6");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
