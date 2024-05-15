package academy.devdojo.devdojoacademy.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // pt-BR
        // https://www.rallybel.com/pt/links_iso_code2.html
        Locale localeItaly = new Locale("it", "ITA");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");
        Calendar calendar = Calendar.getInstance();


        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);


        System.out.println("Italy: " + df1.format(calendar.getTime()));
        System.out.println("Suiça: " + df2.format(calendar.getTime()));
        System.out.println("India: " + df4.format(calendar.getTime()));
        System.out.println("Japao: " + df5.format(calendar.getTime()));
        System.out.println("Holanda: " + df3.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeIndia.getDisplayCountry());
        System.out.println(localeJapao.getDisplayCountry());
        System.out.println(localeHolanda.getDisplayCountry());

        System.out.println(localeHolanda.getDisplayLanguage(localeItaly));
    }
}
