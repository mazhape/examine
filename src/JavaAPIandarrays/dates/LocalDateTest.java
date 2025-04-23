package JavaAPIandarrays.dates;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2020-08-30");
        System.out.println(date.getDayOfMonth());//
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());

        LocalDate shreyaBday = LocalDate.parse("2002-08-30");
        LocalDate paulBday = LocalDate.parse("2002-07-29");
        System.out.println(shreyaBday.isAfter(paulBday));//true
        System.out.println(shreyaBday.isBefore(paulBday));//false
        System.out.println(shreyaBday.isBefore(shreyaBday));//false

        LocalDate bday = LocalDate.of(2052,03,10);
        System.out.println(bday.minusDays(10));//2052-02-29
        System.out.println(bday.minusMonths(2));//2052-01-10
        System.out.println(bday.minusWeeks(30));//2051-08-13
        System.out.println(bday.minusYears(1));//2051-03-10

        LocalDate launchCompany = LocalDate.of(2016,02,29);
        System.out.println(launchCompany.plusDays(1));
        System.out.println(launchCompany.plusMonths(1));
        System.out.println(launchCompany.plusWeeks(7));
        System.out.println(launchCompany.plusYears(1));

        LocalDate firstSex = LocalDate.of(2036,02,28);
        System.out.println(firstSex.withDayOfMonth(1));//2036-02-01
        System.out.println(firstSex.withDayOfYear(1));//2036-01-01
        System.out.println(firstSex.withMonth(7));//2036-07-28
        System.out.println(firstSex.withYear(1));//0001-02-28


        LocalDate interviewDate = LocalDate.of(2016,02,28);
        System.out.println(interviewDate.atTime(16, 30));//2016-02-28T16:30
        System.out.println(interviewDate.atTime(16, 30, 20));////2016-02-28T16:30:20
        System.out.println(interviewDate.atTime(16, 30, 20, 300));//2016-02-28T16:30:20.000000300
        System.out.println(interviewDate.atTime(LocalTime.of(16, 30)));//2016-02-28T16:30
    }
}

//30
//SUNDAY
//243
//AUGUST
//8
//2020

//true
//false
//false

//2052-02-29
//2052-01-10
//2051-08-13
//2051-03-10

//2016-03-01
//2016-03-29
//2016-04-18
//2017-02-28

//2036-02-01
//2036-01-01
//2036-07-28
//0001-02-28

//If you pass any invalid hours, minutes, or seconds value to the
//method atTime, it will throw a DateTimeException at runtime.