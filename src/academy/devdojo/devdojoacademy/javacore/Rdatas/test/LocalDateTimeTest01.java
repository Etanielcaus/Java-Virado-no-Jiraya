package academy.devdojo.devdojoacademy.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2002, 12, 5, 5, 5, 5);
        System.out.println(localDateTime);

        ZoneId zoneIdBR = ZoneId.of("America/Sao_Paulo");
        ZoneId zoneIdJP = ZoneId.of("Asia/Tokyo");
        LocalDateTime localDateTime1 = LocalDateTime.now(zoneIdJP);
        System.out.println(localDateTime1);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime2);

    }
}
