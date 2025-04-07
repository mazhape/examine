package Javadatatype;

public class MyChar {
    public static void main(String[] args) {
        int myInt = 7;
        bool result = true;
        if (result == true)
            do
                System.out.println(myInt);
            while (myInt > 10);
    }
}


// Compilation error

//The correct answer is (c). This question tries to trick you with complex code that
//doesn’t use any if constructs or do-while loops! As you can see, it uses an incorrect
//data type name, bool, to declare and initialize the variable result. Therefore, the
//code will fail to compile.