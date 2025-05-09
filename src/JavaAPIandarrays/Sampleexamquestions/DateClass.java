package JavaAPIandarrays.Sampleexamquestions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateClass {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_DATE);
        LocalDate d2 = LocalDate.of(2015, 2, 5);
        LocalDate d3 = LocalDate.now();
        System.out.println(d1);//2015-02-05
        System.out.println(d2);//2015-02-05
        System.out.println(d3);//2015-04-16
    }
}
