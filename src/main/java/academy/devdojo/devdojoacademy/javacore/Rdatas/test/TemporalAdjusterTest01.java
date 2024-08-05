package academy.devdojo.devdojoacademy.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.plusDays(2);

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.withDayOfMonth(20);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(ChronoField.DAY_OF_MONTH, 1);
        System.out.println(now);


        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println(now);
    }
}
