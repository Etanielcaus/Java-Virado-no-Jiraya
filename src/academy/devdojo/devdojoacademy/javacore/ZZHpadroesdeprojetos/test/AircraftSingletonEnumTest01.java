package academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.test;

import academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.dominio.AircraftSingletonEnum;
import academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.dominio.AircraftSingletonLazy;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
