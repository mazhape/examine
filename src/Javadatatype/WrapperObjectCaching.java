package Javadatatype;

public class WrapperObjectCaching {
    public static void main(String[] args) {
        Long var1 = Long.valueOf(123);      // within cache range
        Long var2 = Long.valueOf("123");    // still 123, within cache
        System.out.println(var1 == var2);   // line A true

        Long var3 = Long.valueOf(223);      // outside cache
        Long var4 = Long.valueOf(223);      // another object
        System.out.println(var3 == var4);   // line B false

    }
}

//true
//false