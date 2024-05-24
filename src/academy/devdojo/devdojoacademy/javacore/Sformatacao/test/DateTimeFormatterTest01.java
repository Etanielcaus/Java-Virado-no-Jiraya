package academy.devdojo.devdojoacademy.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parseDate = LocalDate.parse("20240118", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parseDate);
        System.out.println(parseDate.getDayOfWeek());

        LocalDateTime now = LocalDateTime.now();
        String formatNow = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(formatNow);
        LocalDateTime parse = LocalDateTime.parse("2024-05-23T21:42:11.7161006", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String dataAtualFormatada = LocalDate.now().format(formatterBR);
        System.out.println(dataAtualFormatada);
        LocalDate parsedBR = LocalDate.parse("23/maio/2024", formatterBR);
        System.out.println(parsedBR);

        DateTimeFormatter dateTimeFormatterKorean = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.KOREAN);
        String formatKorean = LocalDate.now().format(dateTimeFormatterKorean);
        System.out.println(formatKorean);

        DateTimeFormatter dateTimeFormatterItaly = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.ITALIAN);
        String formatItaly = LocalDate.now().format(dateTimeFormatterItaly);
        System.out.println(formatItaly);


    }
}
