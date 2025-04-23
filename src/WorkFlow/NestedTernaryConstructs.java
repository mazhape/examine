package WorkFlow;

public class NestedTernaryConstructs {
    public static void main(String[] args) {
        int bill = 2000;
        int qty = 10;
        int discount = (bill > 1000)? (qty > 11)? 10 : 9 : 5;
        System.out.println(discount);

        int bills = 2000;
        int qtys = 10;
        int days = 10;
        int discounts = (bills > 1000)? (qtys > 11)? 10 : days > 9? 20 : 30 : 5;
        System.out.println(discounts);//20
    }
}

//Let's break it down step by step:
//Outer ternary:
//(bill > 1000)
//→ true (since bill = 2000)
//
//Since the outer condition is true, Java evaluates the inner ternary:
//(qty > 11) ? 10 : 9
//→ qty = 10, so (10 > 11) is false → returns 9
//
//So the final result is:9


//Breakdown:
//Outer check: (bill > 1000) → 2000 > 1000 → true
//→ so we evaluate the nested expression.
//
//Next check: (qty > 11) → 10 > 11 → false
//→ now we evaluate the next nested ternary: (days > 9) → 10 > 9 → true
//→ so we get 20.