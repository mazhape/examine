package JavaAPIandarrays.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParseTest {
    public static void main(String[] args) {
        String dateStr = "15-04-2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        System.out.println(date); // 2025-04-15

        String timeStr = "09:45 PM";
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time = LocalTime.parse(timeStr, timeFormatter);
        System.out.println(time); // 21:45

        String dateTimeStr = "15-04-2025 09:45 PM";
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, dtFormatter);
        System.out.println(dateTime); // 2025-04-15T21:45

    }
}
