//Let’s modify the definition of the class Phone that I previously used to demonstrate the
//encapsulation principle in this section. Given the following definition of class Phone,
//which of the options, when replacing the code on lines 1–3, makes it a well-encapsulated class?
//class Phone {
// public String model;
// double weight; //LINE1
// public void setWeight(double w) {weight = w;} //LINE2
// public double getWeight() {return weight;} //LINE3
//}
//Options:
//a public double weight;
//private void setWeight(double w) { weight = w; }
//private double getWeight() { return weight; }
//b public double weight;
//void setWeight(double w) { weight = w; }
//double getWeight() { return weight; }
//c public double weight;
//protected void setWeight(double w) { weight = w; }
//protected double getWeight() { return weight; }
//d public double weight;
//public void setWeight(double w) { weight = w; }
//public double getWeight() { return weight; }
//e None of the above

package MethodsAndEncapsulation.objectfield;

 class PhoneEncapsulationTwist {
    public String model;
    double weight; //LINE1
    public void setWeight(double w) {weight = w;} //LINE2
    public double getWeight() {return weight;} //LINE
}


//Correct Answer: e. None of the above
//None of the options encapsulate the field properly.
//A well-encapsulated version would look like this:

//class Phone {
//    private double weight; // ✅ private field
//
//    public void setWeight(double w) { weight = w; } // ✅ public setter
//    public double getWeight() { return weight; }    // ✅ public getter
//}