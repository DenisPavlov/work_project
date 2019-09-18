package links.java8.datatime;

import java.time.LocalDate;
import java.time.Month;

public class Example1 {
    public static void main(String[] args) {
        // the current date
        LocalDate currentDate = LocalDate.now();

        // 2014-02-10
        LocalDate tenthFeb2014 = LocalDate.of(2014, Month.FEBRUARY, 10);

        // months values start at 1 (2014-08-01)
        LocalDate firstAug2014 = LocalDate.of(2014, 8, 1);

        // the 65th day of 2010 (2010-03-06)
        LocalDate sixtyFifthDayOf2010 = LocalDate.ofYearDay(2010, 65);

    }
}
