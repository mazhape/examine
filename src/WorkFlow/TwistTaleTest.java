package WorkFlow;

public class TwistTaleTest {
    public static void main(String[] args) {
        String day = new String("SUN");

        switch (day) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU":
                System.out.println("Time to work");
                break;
            case "FRI":
                System.out.println("Nearing weekend");
                break;
            case "SAT":
            case "SUN":
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Invalid day?");
        }

    }
}
//Weekend!
//Explanation:
//String day = new String("SUN");:
//A new String object with the value "SUN" is created and assigned to the variable day.
//Switch statement:
//The switch compares the value of day to each case.
//The case "MON":, case "TUE":, case "WED":, and case "THU": are grouped together. These cases will all print "Time to work" if day is any of these values.
//If day is "FRI", it prints "Nearing weekend".
//The case "SAT": and case "SUN": are grouped together. If day is "SAT" or "SUN", it prints "Weekend!".
//Since day is "SUN", it matches the case "SAT": or case "SUN": block and prints "Weekend!".