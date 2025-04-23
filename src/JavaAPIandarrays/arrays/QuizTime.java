package JavaAPIandarrays.arrays;

abstract class Shape {}
class Circle extends Shape {}
class Square {} // ❌ does NOT extend Shape
public class QuizTime {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();  // ✅
        shapes[1] = new Square();  // ❓ What happens here?  ❌ Compilation error
    }
}

//Why the Error Happens:
//The array is of type Shape[], so it can only store instances of Shape or its subclasses.
//Square is not related to Shape, so the compiler won’t allow it — even if the object “looks similar” structurally.
//Java is strictly type-checked at compile time when it comes to arrays.
//✅ Legal Fix:
//To make it work, you could do:
//class Square extends Shape {}
//Now everything compiles fine.