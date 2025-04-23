package JavaAPIandarrays.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        Period period1 = Period.of(1, 2, 7);//1 year, 2 months,and 7 days
        Period period2 = Period.ofYears(2);//2 years
        Period period3 = Period.ofMonths(5);//5 months
        Period period4 = Period.ofWeeks(10);//10weeks
        Period period5 = Period.ofDays(15);//15days
        Period period6 = Period.ofDays(-15);//-15days

        Period p5Yrs1 = Period.parse("P5y");//Period of 5 years
        Period p5Yrs2 = Period.parse("p5y");//Period of 5 years
        Period p5Yrs3 = Period.parse("P5Y");//Period of 5 years
        Period p5Yrs4 = Period.parse("+P5Y");//Period of 5 years
        Period p5Yrs5 = Period.parse("P+5Y");//Period of 5 years
        Period p5Yrs6 = Period.parse("-P-5Y");//Period of 5 years
        System.out.println(p5Yrs1 + ":" + p5Yrs2);//Outputs P5Y:P5Y

        Period p5Yrs7 = Period.parse("P5y1m2d");
        Period p5Yrs8 = Period.parse("p9m");
        Period p5Yrs9 = Period.parse("P60d");
        Period p5Yrs10 = Period.parse("-P5W");
        System.out.println();

        LocalDate date = LocalDate.of(2052, 01, 31);
        System.out.println(date.plus(Period.ofDays(1)));//2052-02-01

        LocalDateTime dateTime = LocalDateTime.parse("2052-01-31T14:18:36");
        System.out.println(dateTime.plus(Period.ofMonths(1)));//2052-02-29T14:18:36

        LocalDateTime dateeTime = LocalDateTime.parse("2020-01-31T14:18:36");
        System.out.println(dateeTime.minus(Period.ofYears(2)));//2018-01-31T14:18:36
        LocalDate daate = LocalDate.of(2052, 01, 31);
        System.out.println(daate.minus(Period.ofWeeks(4)));//2052-01-03

        Period period = Period.of(2,4,40);
        System.out.println(period.getYears());//2
        System.out.println(period.getMonths());//4
        System.out.println(period.getDays());//40

        Period days5 = Period.of(0,0,5);
        System.out.println(days5.isZero());//false
        Period daysMinus5 = Period.of(0,0,-5);
        System.out.println(daysMinus5.isNegative());//true

        Period period5Month = Period.of(0, 5, 0);
        Period period10Month = Period.of(0, 10, 0);
        Period period10Days = Period.of(0, 0, 10);
        System.out.println(period5Month.plus(period10Month));//P15M
        System.out.println(period10Days.plusDays(35));//P45D
        System.out.println(period10Days.plusMonths(5));//P5M10D
        System.out.println(period10Days.plusYears(5));//P5Y10D
    }
}

//P5Y1M2D
//P9M
//P60D
//P-35D