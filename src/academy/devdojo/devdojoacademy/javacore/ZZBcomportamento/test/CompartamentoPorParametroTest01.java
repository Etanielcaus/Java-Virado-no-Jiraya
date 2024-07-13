package academy.devdojo.devdojoacademy.javacore.ZZBcomportamento.test;

import academy.devdojo.devdojoacademy.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class CompartamentoPorParametroTest01 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Blue", 2013));
        cars.add(new Car("Yellow", 2024));
        cars.add(new Car("Red", 2015));
        cars.add(new Car("Green", 2016));
        cars.add(new Car("Green", 2017));

        System.out.println(carsFilterGreen(cars));
        System.out.println(carsFilterColor(cars, "Red"));
        System.out.println(carsDate(cars, 2015));


    }

    private static List<Car> carsFilterGreen (List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
//        cars.forEach(car -> greenCars.add(car));
        for (Car car : cars) {
            if (car.getColor().equals("Green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> carsFilterColor (List<Car> cars, String color){
        List<Car> coloredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                coloredCars.add(car);
            }
        }
        return coloredCars;
    }

    private static List<Car> carsDate (List<Car> cars, int date){
        List<Car> yearDate = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() > date) {
                yearDate.add(car);
            }
        }
        return yearDate;
    }
}
