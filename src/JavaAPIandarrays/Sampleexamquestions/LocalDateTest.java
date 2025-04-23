package JavaAPIandarrays.Sampleexamquestions;

public class LocalDateTest {
    public static void main(String[] args) {
        java.time.LocalDate dt = java.time.LocalDate.parse("2015-01-01")
                .minusMonths(1)       // 2014-12-01
                .minusDays(1)         // 2014-11-30
                .plusYears(1);        // 2015-11-30

        System.out.println(dt);    // Output: 2015-11-30
    }
}
