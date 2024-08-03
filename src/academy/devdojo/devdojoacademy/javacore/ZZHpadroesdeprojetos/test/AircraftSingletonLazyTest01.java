package academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.test;

import academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.dominio.AircraftSingletonLazy;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
//        System.out.println(seat);
//        System.out.println(AircraftSingletonEager.getINSTANCE());
        AircraftSingletonLazy aircraftSingletonEager = AircraftSingletonLazy.getINSTANCE();
        System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}
