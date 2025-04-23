package JavaAPIandarrays.dates;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 20, 12, 98547);
        System.out.println(time.getHour());//16
        System.out.println(time.getMinute());//20
        System.out.println(time.getSecond());//12
        System.out.println(time.getNano());//98547

        LocalTime shreyaFinishTime = LocalTime.parse("17:09:04");
        LocalTime paulFinishTime = LocalTime.parse("17:09:12");
        if(shreyaFinishTime.isBefore(paulFinishTime))
            System.out.println("Shreya wins");
        else
            System.out.println("Paul wins");

        LocalTime movieStartTime = LocalTime.parse("21:00:00");
        int commuteMin = 35;
        LocalTime shreyaStartTime = movieStartTime.minusMinutes(commuteMin);
        System.out.println("Start by " + shreyaStartTime + " from office");//Start by 20:25 from office

        int worldRecord = 10;
        LocalTime raceStartTime = LocalTime.of(8, 10, 55);
        LocalTime raceEndTime = LocalTime.of(8, 11, 11);
        if (raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime))
            System.out.println("New world record");
        else
            System.out.println("Try harder");//Try harder

        LocalTime startTime = LocalTime.of(5, 7, 9);
        if (startTime.getMinute() < 30)
            startTime = startTime.withMinute(0);
        System.out.println(startTime);//05:00:09
    }
}
//Outputs Shreya wins