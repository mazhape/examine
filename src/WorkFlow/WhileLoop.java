package WorkFlow;

public class WhileLoop {
    public static void main(String[] args) {
        int num = 9;
        boolean divisibleBy7 = false;
       // boolean divisibleBy7 = true;//code won’t enter the loop because the condition divisibleBy7==false isn’t true
        while (!divisibleBy7) {
            System.out.println(num);
            if (num % 7 == 0) divisibleBy7 = true;
            --num;
        }
    }
}

//9
//8
//7