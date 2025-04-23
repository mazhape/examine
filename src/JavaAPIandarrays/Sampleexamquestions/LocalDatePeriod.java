package JavaAPIandarrays.Sampleexamquestions;

import java.time.LocalDate;
import java.time.Period;

public class LocalDatePeriod {
        public LocalDate process(LocalDate ld){
            //INSERT CODE HERE
            LocalDate ld2 = ld.plus(Period.of(0, 1, 1));
            return ld2;

    }
}
//LocalDate ld2 = ld.plus(Period.of(0, 1, 1));
//public static Period of(int years, int months, int days)
//Obtains a Period representing a number of years, months and days.
//This creates an instance based on years, months and days.