package MethodsAndEncapsulation.LocalVariable;

class Student {
    private double marks1, marks2, marks3;//Instance variables
    private double maxMarks = 100;//Instance variables
    public double getAverage() {
        double avg = 0;//Local variable avg
        avg = ((marks1 + marks2 + marks3) / (maxMarks*3)) * 100;
        return avg;
    }
    public void setAverage(double val) {
        avg = val;//This code won’t compile because avg is inaccessible outside the method getAverage.
    }
}