package JavaAPIandarrays.equalsmethod;

public class EqualsOperatorTest {
    public static void main(String[] args) {
        String var1 = new String("Java");
        String var2 = new String("Java");
        System.out.println(var1.equals(var2));//Prints true
        System.out.println(var1 == var2);//Prints false
        System.out.println(var1 != var2);//Prints true

        String var3 = "code";
        String var4 = "code";
        System.out.println(var3.equals(var4));//Prints true
        System.out.println(var3 == var4);//Prints true
        System.out.println(var3 != var4);//Prints false
    }
}
