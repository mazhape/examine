package JavaAPIandarrays.arrays;

interface MyInterfaces {}
class MyClasss1 implements MyInterface {}
abstract class Vehiclee{}
class Carr extends Vehiclee {}
public class TestObject {
    public static void main(String[] args) {
        Object[] objArray = new Object[] {
                new MyClasss1(),              // ✅ implements interface → Object
                null,                        // ✅ null is valid for any ref type
                new Carr(),                  // ✅ extends abstract class → Object
                new java.util.Date(),        // ✅ Object
                new String("name"),   // ✅ String → Object
                new Integer[7]               // ✅ Array of Integer → also Object!
        };
    }
}
