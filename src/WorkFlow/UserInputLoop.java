package WorkFlow;

import java.util.Scanner;

public class UserInputLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter something (or 'exit'): ");
            input = sc.nextLine();

            if (input.equals("exit")) {
                break; // Exit the loop
            }

            System.out.println("You typed: " + input);
        }
    }
}

//