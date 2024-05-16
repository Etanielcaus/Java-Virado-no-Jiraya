package academy.devdojo.devdojoacademy.javacore.Rdatas.test;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(12,25, 50);
        System.out.println(localTime1);
        System.out.println(localTime1.get(ChronoField.HOUR_OF_DAY));

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        Clock clockInTokyo = Clock.system(tokyoZone);
        LocalTime localTime2 = LocalTime.now(clockInTokyo);
        System.out.println(localTime2);
    }
}
