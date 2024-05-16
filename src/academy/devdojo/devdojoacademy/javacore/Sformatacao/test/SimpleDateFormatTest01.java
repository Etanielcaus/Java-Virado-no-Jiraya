package academy.devdojo.devdojoacademy.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
        String pattern = "dd 'de' MMMM 'de' yyyy 'as' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("15 de maio de 2024 as 21:43:43 BRT"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
