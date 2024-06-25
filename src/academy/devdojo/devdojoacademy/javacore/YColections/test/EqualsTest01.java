package academy.devdojo.devdojoacademy.javacore.YColections.test;

import academy.devdojo.devdojoacademy.javacore.YColections.dominio.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {
//        String nome = "Joao";
//        String nome2 = "Joao";
//        String nome2 = new String("Joao");
//        System.out.println(nome2 == nome); // Retorna False
//        System.out.println(nome2.equals(nome));

        SmartPhone xiaomi = new SmartPhone("123", "xiaomi");
        SmartPhone xiaomi2 = new SmartPhone("123", "xiaom5ti");
        SmartPhone xiaomi3 = xiaomi;

        System.out.println(xiaomi2.getMarca().equals(xiaomi.getMarca()));
        System.out.println(xiaomi.equals(xiaomi3));
        System.out.println(xiaomi.hashCode());
        System.out.println(xiaomi2.hashCode());
        System.out.println(xiaomi3.hashCode());


    }
}
