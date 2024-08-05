package academy.devdojo.devdojoacademy.javacore.ZZBcomportamento.test;

import academy.devdojo.devdojoacademy.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.devdojoacademy.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CompartamentoPorParametroTest02 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Blue", 2013));
        cars.add(new Car("Yellow", 2024));
        cars.add(new Car("Red", 2015));
        cars.add(new Car("Green", 2016));
        cars.add(new Car("Green", 2017));

//        System.out.println(filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
////                return car.getColor().toLowerCase().equals("green");
//                return car.getColor().equalsIgnoreCase("green");
//            }
//        }));

//        Lambda method
        System.out.println(filter(cars, car -> car.getColor().equalsIgnoreCase("green")));
        System.out.println(filter(cars, car -> car.getYear() < 2015));

    }
    private static List<Car> filter (List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }


//      O java ja possui uma interface predicate
//    private static List<Car> filter (List<Car> cars, Predicate<Car> carPredicate){
//        List<Car> filteredCars = new ArrayList<>();
//        for (Car car : cars) {
//            if (carPredicate.test(car)) {
//                filteredCars.add(car);
//            }
//        }
//        return filteredCars;
//    }

}