package WorkFlow;

public class CaserString {
    public static void main(String[] args) {
        String animal = "Tiger";
        switch (animal) {
            case "Lion":
                System.out.println("Roar!");
                break;
            case "Tiger":
                System.out.println("Grrr!");
                break;
            default:
                System.out.println("Unknown animal");
        }


        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
        }

    }
}

//Grrr!

//Tuesday
//Wednesday