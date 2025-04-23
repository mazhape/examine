package JavaAPIandarrays.Sampleexamquestions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EJavaGuruLocalDate {
    public static void main(String[] args) {
        String printDate = LocalDate.parse("2057-08-11")
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(printDate);
    }
}

//Runtime exception
//The example code in this question calls LocalDate.parse(), passing it a
//string value but no DateTimeFormatter instance. In this case, the text 2057-08-11 is
//parsed using DateTimeFormatter.ISO_LOCAL_DATE. LocalDate.parse() returns a
//LocalDate instance.
// The example code then calls the format method on a LocalDate instance, using
//DateTimeFormatter.ISO_DATE_TIME. The code compiles successfully because the
//format method accepts a DateTimeFormatter instance. But format() throws an exception at runtime because it tries to format a LocalDate instance using a formatter
//(ISO_DATE_TIME) that defines rules for a date/time object. When no matching time
//values are found in a LocalDate object, an exception is thrown