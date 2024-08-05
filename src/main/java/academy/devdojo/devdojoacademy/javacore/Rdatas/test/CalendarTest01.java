package academy.devdojo.devdojoacademy.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        // Também depreciado.
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        Date date = c.getTime();
        System.out.println(date);

    }
}
