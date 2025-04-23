package JavaAPIandarrays.arrays;

abstract class Vehicles {}
class Cars extends Vehicles {}
class Bike {}
class ExamStyleTrap {
    public static void main(String[] args) {
        Vehicle[] arr = new Vehicle[2];
        arr[0] = new Car();     // ✅
        arr[1] = new Bike();    // ❌ Compile-time error — why? Because Bike doesn’t extend Vehicle.
    }
}

//Key Takeaways:
//✅ You can declare arrays of an abstract class.
//✅ You can store subclass objects inside.
//❌ You cannot instantiate the abstract class directly.
//❌ You cannot store unrelated classes.