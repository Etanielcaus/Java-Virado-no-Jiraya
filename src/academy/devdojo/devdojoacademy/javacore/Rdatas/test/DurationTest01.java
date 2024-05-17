package academy.devdojo.devdojoacademy.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(3).plusMinutes(5);

        LocalTime localTimeNow = LocalTime.now();
        LocalTime localTimeMinus7Hours = LocalTime.now().minusHours(7).plusMinutes(2);

        Instant instantSeconds = Instant.now().plusSeconds(5);
        Instant instantEpoch = Instant.ofEpochSecond(20, 500);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(localTimeNow, localTimeMinus7Hours);
        Duration d3 = Duration.between(instantSeconds, instantEpoch);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

    }
}
