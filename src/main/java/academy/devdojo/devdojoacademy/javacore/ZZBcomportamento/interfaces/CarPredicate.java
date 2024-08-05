package academy.devdojo.devdojoacademy.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.devdojoacademy.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
//    (parametro) -> <expressao>
//    (Car car) -> function
}
