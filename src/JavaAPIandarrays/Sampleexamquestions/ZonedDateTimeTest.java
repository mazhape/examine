package JavaAPIandarrays.Sampleexamquestions;

import java.time.*;

public class ZonedDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);

        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Duration.ofDays(1));
        System.out.println(date);

        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1));
        System.out.println(date);
    }
}

//2015-11-01T09:00-05:00[US/Eastern]
//2015-11-01T10:00-05:00[US/Eastern]