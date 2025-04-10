package MethodsAndEncapsulation;

class Phon {
    double weight;
    void setWeight(double val) {
        weight =val;
    }
    double getWeight() {
        return weight;
    }
}
public class EJavaTestMethods2 {
    public static void main(String args[]) {
        Phon p = new Phon();
        double newWeight = p.getWeight();//1.Will compile
        int newWeight2 = p.getWeight();//2. Won’t compile
    }
}


//In the preceding code, 1 will compile successfully because the return type of the
//method getWeight is double and the type of the variable newWeight is also double.
//But 2 won’t compile because the double value returned from method getWeight
//can’t be assigned to variable newWeight2, which is of type int