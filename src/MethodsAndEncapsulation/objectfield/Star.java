//An object field is another name for an instance variable defined in a class. I’ve often
//seen certification aspirants who are confused over whether the object fields are the
//same as instance variables of a class.
package MethodsAndEncapsulation.objectfield;

class Star {
    double starAge; //Instance variable—starAge
    public void setAge(double newAge) { //Setter method—setAge
        starAge = newAge;
    }
    public double getAge() {//Getter method—getAge
        return starAge;
    }
}
