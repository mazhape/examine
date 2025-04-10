package MethodsAndEncapsulation;

class Phonee {
    double weight;
    void setWeight(double val) {//Method with return type void
        weight =val;
    }
    double getWeight() {//Method with return type double
        return weight;
    }
}
class TestMethods {
    public static void main(String args[]) {
        Phonee p = new Phonee();
        double newWeight = p.setWeight(20.0);//Because the method setWeight doesn’t return any value, this line won’t compile.
    }
}


//The preceding code won’t compile because the method setWeight doesn’t return a
//value. Its return type is void. Because the method setWeight doesn’t return a value,
//there’s nothing to be assigned to the variable newWeight, so the code fails to compile.