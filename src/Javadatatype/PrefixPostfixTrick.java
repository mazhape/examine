package Javadatatype;

public class PrefixPostfixTrick {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a + a++ + --a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

//a = 7
//b = 26


//Initial state:
//a = 5
//
//1️⃣ a++
//Use a → 5
//
//Then increment a → a = 6
//
//Contributes 5 to b
//
//2️⃣ ++a
//Increment a → a = 7
//
//Then use it → 7
//
//Contributes 7 to b
//
//3️⃣ a++
//Use a → 7
//
//Then increment a → a = 8
//
//Contributes 7 to b
//
//4️⃣ --a
//Decrement a → a = 7
//
//Then use it → 7
//
//Contributes 7 to b
//b = 5 + 7 + 7 + 7 = 26
//Final value of a = 7