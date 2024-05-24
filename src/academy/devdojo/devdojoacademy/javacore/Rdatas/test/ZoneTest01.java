package academy.devdojo.devdojoacademy.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);

        System.out.println(ZoneId.systemDefault());

        ZoneId zoneIdTK = ZoneId.of("Asia/Tokyo");
        ZoneId zoneIdSystem = ZoneId.systemDefault();
        ZoneId zoneIdShangai = ZoneId.of("Asia/Shanghai");
        System.out.println(zoneIdTK);
        System.out.println(zoneIdShangai);

        LocalDateTime nowTK = LocalDateTime.now(zoneIdTK);
        LocalDateTime nowChina = LocalDateTime.now(zoneIdShangai);
        LocalDateTime nowSystem = LocalDateTime.now(zoneIdSystem);
        System.out.println(nowTK);
        System.out.println(nowChina);
        System.out.println(nowSystem);


        System.out.println("--");
        ZonedDateTime zonedDateTimeTK = nowTK.atZone(zoneIdTK);
        ZonedDateTime zonedDateTimeChina = nowSystem.atZone(zoneIdShangai);
        System.out.println(zonedDateTimeChina);
        System.out.println(zonedDateTimeTK);

        Instant nowInstant = Instant.now();
        ZonedDateTime zonedDateTimeInstant = nowInstant.atZone(zoneIdTK);
        System.out.println(zonedDateTimeInstant);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        LocalDateTime now = LocalDateTime.now();
        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, zoneOffsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime2);


        JapaneseDate fromJapan = JapaneseDate.from(LocalDateTime.now());
        System.out.println(fromJapan);
    }
}
