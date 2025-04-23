package JavaAPIandarrays.dates;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class FormatExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);

        System.out.println("Medium Date: " + now.format(formatter1));
        System.out.println("Full Time: " + now.format(formatter2));
        System.out.println("Long DateTime: " + now.format(formatter3));
        System.out.println("Short DateTime: " + now.format(formatter4));
        DateTimeFormatter formatter =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        LocalTime time = LocalTime.now();
        System.out.println(formatter.format(time));//Throws runtime exception

        LocalDate date = LocalDate.of(2057,8,11);
        LocalTime time = LocalTime.of(14,30,15);
        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("y");
        DateTimeFormatter d2 = DateTimeFormatter.ofPattern("YYYY");
        DateTimeFormatter d3 = DateTimeFormatter.ofPattern("Y M D");
        DateTimeFormatter d4 = DateTimeFormatter.ofPattern("e");
        DateTimeFormatter t1 = DateTimeFormatter.ofPattern("H h m s");
        DateTimeFormatter t2 = DateTimeFormatter.ofPattern("'Time now:'HH mm a");
        System.out.println(d1.format(date));
        System.out.println(d2.format(date));
        System.out.println(d3.format(date));
        System.out.println(d4.format(date));
        System.out.println(t1.format(time));
        System.out.println(t2.format(time));
    }
}
//Medium Date: Apr 16, 2025
//Full Time: 10:15:30 AM Pacific Daylight Time
//Long DateTime: April 16, 2025 at 10:15:30 AM PDT
//Short DateTime: 4/16/25 10:15 AM


//2057
//2057
//2057 8 223
//7
//14 2 30 15
//Time now:14 30 PM