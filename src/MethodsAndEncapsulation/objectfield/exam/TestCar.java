package MethodsAndEncapsulation.objectfield.exam;

 class Car {
    String brand;
}

class TestCar {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Toyota";               // ✅ Writing directly
        System.out.println(c.brand);      // ✅ Reading directly
    }
}


//🛑 OCA Exam Tip: If the field is private, direct access outside the class is not allowed.
//✅ 3. Directly Accessing Instance Variables
//Direct access means you're reading or writing the field without using methods, usually within the same class or from another class (if the field is not private).


//🧠 Summary Table
// Method	               Can Write?	Can Read?	Common in Practice?
// Using methods (get/set)	    ✅	      ✅	      ✅ Recommended
// Using constructors	        ✅	      ❌	      ✅ For initialization
// Direct access	            ✅	      ✅	      ⚠️ Only if not private