package MethodsAndEncapsulation;

class Phons {
    double weight;
    void setWeight(double val) {
        weight =val;
    }
    double getWeight() {
        return weight;
    }
}
public class EJavaTestMethods2ExplicitCast {
    public static void main(String args[]) {
        Phons p = new Phons();
        double newWeight = p.getWeight();//Will compile
        int newWeight2 = (int)p.getWeight();//Will compile with an explicit cast
    }
}
