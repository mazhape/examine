package WorkFlow;

public class CollectionOfObjects {
    public static void main(String[] args) {
        StringBuilder myArr[] = {
                new StringBuilder("Java"),
                new StringBuilder("Loop")
        };
        for (StringBuilder val : myArr)
            System.out.println(val);
        for (StringBuilder val : myArr)
            val.append("Oracle");
        for (StringBuilder val : myArr)
            System.out.println(val);

        //
        StringBuilder myArr1[] = {
                new StringBuilder("Java"),
                new StringBuilder("Loop")
        };
        for (StringBuilder val1 : myArr1)
        System.out.println (val1);//Iterates through array myArr and prints Java and Loop
        for (StringBuilder val1 : myArr1)
            val1 = new StringBuilder("Oracle");//Assigns new StringBuilder object to reference variable val with value Oracle
        for (StringBuilder val1 : myArr1)
            System.out.println (val1);//Iterates through array myArray and still prints Java and Loop
    }
}

//Java
//Loop
//JavaOracle
//LoopOracle