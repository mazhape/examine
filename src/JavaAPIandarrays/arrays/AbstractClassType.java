package JavaAPIandarrays.arrays;

abstract class Vehicle{}
class Car extends Vehicle {}
class Bus extends Vehicle {}
 class AbstractClassType {
    Vehicle[] vehicleArray = { new Car(),
            new Bus(),
            null};
}

//What’s Going On Here?
//Vehicle is an abstract class, so it cannot be instantiated directly.
//Car and Bus are concrete subclasses of Vehicle.
//Vehicle[] vehicleArray is declared to hold references to Vehicle (or any subclass of Vehicle).

//🔑 Analysis of the Array Contents:

//Index	             Value	  Valid?	Explanation
//vehicleArray[0]	new Car()	✅	     Car is a subclass of Vehicle
//vehicleArray[1]	new Bus()	✅	     Bus is also a subclass of Vehicle
//vehicleArray[2]	null	    ✅	     null is a valid value for any reference type

//OCA Exam Angle
//You can declare an array of an abstract class.
//You can store objects of subclasses inside it.
//Null values are allowed.
//You cannot do this:

//Vehicle v = new Vehicle(); // ❌ Compilation error