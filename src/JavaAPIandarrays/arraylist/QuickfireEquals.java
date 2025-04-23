package JavaAPIandarrays.arraylist;

public class QuickfireEquals {
   // 🔸 Question 1
    class A {
        public boolean equals(A obj) {
            return true;
        }
    }
//    What’s true?
//    A) Compiles
//    B) Correctly overrides equals()
//    C) Both
//    D) Neither

//🔸 Question 2
    class B {
        public boolean equals(Object obj) {
            return obj instanceof B;
        }
    }
//    What’s true?
//    A) Compiles
//    B) Correctly implements equals
//    C) Breaks equals contract
//    D) Won’t compile

//🔸 Question 3
    class C {
        String name;
        public boolean equals(Object obj) {
            C c = (C) obj;
            return this.name.equals(c.name);
        }
    }
//    What’s true?
//    A) Safe and correct
//    B) Compiles but throws exception at runtime
//    C) Doesn't compile
//    D) Follows equals contract

//🔸 Question 4
    class D {
        int id;
        public boolean equals(Object obj) {
            return obj != null && ((D)obj).id == this.id;
        }
    }
//    What’s true?
//    A) Compiles
//    B) Safe
//    C) Fails instanceof check
//    D) Can throw ClassCastException

//🔸 Question 5
    class E {
        int id;
        public boolean equals(Object obj) {
            if (!(obj instanceof E)) return false;
            E e = (E)obj;
            return this.id == e.id;
        }
    }
//    What’s true?
//    A) Compiles
//    B) Follows equals contract
//    C) Safe implementation
//    D) All of the above


}

//✅ Correct Answer: A
//Explanation:
//This compiles, but doesn't override Object.equals(Object) because the signature is different (equals(A) instead of equals(Object)). So it's not a valid override — just an overloaded method.

//✅ Correct Answer: B
//Explanation:
//This is a valid override of equals(Object) and follows the contract loosely — it just checks type compatibility. It does compile and works, though it could be more thorough (e.g. checking fields).

//✅ Correct Answer: B
//Explanation:
//Yes! It compiles, but is not safe because there's no instanceof check. If obj isn't a C, it'll throw ClassCastException. You nailed it.

//✅ Correct Answer: D
//Explanation:
//This compiles and checks for null, but doesn't check if obj is a D, so it can throw a ClassCastException. You almost had it!


//✅ Correct Answer: D (All of the above)
//Explanation:
//This is the textbook correct way to override equals:
//It checks for type safety.
//Avoids NullPointerException.
//Compares relevant data. You got the compile part right, but missed that it also follows the contract and is safe.