package WorkFlow;

public class DoWhileLoop {
    public static void main(String[] args) {
        int num = 9;                    // Initialize num to 9
        boolean divisibleBy7 = false;   // Flag to track if we found a number divisible by 7
       // boolean divisibleBy7 = true;The output of the preceding code is as follows:9
        do {
            System.out.println(num);     // Print current number
            if (num % 7 == 0)           // Check if number is divisible by 7
                divisibleBy7 = true;    // If yes, set flag to true
            num--;                     // Decrement the number
        } while (divisibleBy7 == false); // Continue loop while no number divisible by 7 is found
    }
}


//9
//8
//7