package academy.devdojo.devdojoacademy.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate lc = LocalDate.now();
        LocalDate lcPlusYears = LocalDate.now().plusYears(2);
        LocalDate lcKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));


        Period period = Period.between(lcKolkata, lcPlusYears);
        Period period2 = Period.ofDays(10);
        System.out.println(period);
        System.out.println(period2);

        Period p1 = Period.ofDays(90);
        System.out.println(lc.until(lc.plusDays(p1.getDays()), ChronoUnit.DAYS));
    }
}
