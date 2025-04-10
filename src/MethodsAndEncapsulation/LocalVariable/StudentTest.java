package MethodsAndEncapsulation.LocalVariable;

public class StudentTest {
        public double getAverage() {
            if (maxMarks > 0) {
                double avg = 0;
                avg = (marks1 + marks2 + marks3)/(maxMarks*3) * 100;
                return avg;
            }
            else {
                avg = 0;
                return avg;
            }

    }

}
