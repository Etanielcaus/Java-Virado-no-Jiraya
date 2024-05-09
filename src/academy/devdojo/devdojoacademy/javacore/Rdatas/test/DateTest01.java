package academy.devdojo.devdojoacademy.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        // Date está depreciado. Não é mais utilizavel.
        Date date = new Date(1_000_000_000); //representa ms /long
        System.out.println(date);
        System.out.println(date.getTime()); // Pega o dia de hoje, porém em ms


    }
}
