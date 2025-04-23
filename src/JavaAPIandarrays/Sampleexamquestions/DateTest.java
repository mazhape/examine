package JavaAPIandarrays.Sampleexamquestions;

import java.time.*;
import java.time.format.*;
public class DateTest{
    public static void main(String[] args){ //1
        LocalDateTime greatDay = LocalDateTime.parse("2015-01-01");//2
        String greatDayStr = greatDay.format(DateTimeFormatter.ISO_DATE_TIME); //3
        System.out.println(greatDayStr);//4
    }
}
////2 will throw an exception at run time.
//It will throw a DateTimeException because it doesn't have time component.
//
//Exception in thread "main" java.time.format.DateTimeParseException:
//    Text '2015-01-01' could not be parsed at index 10.
//
//A String such as 2015-01-01T17:13:50 would have worked.