package academy.devdojo.devdojoacademy.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate date = LocalDate.of(2024, 6, 18);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date);

        ZoneId zoneid = ZoneId.of("America/Sao_Paulo");
        ZoneId zoneidJP = ZoneId.of("Asia/Tokyo");
        LocalDate nowDefault = LocalDate.now();
        LocalDate nowCountryes = LocalDate.now(zoneidJP);
        System.out.println(nowDefault);
    }
}
