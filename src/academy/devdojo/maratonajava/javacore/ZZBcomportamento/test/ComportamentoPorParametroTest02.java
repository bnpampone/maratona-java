package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("gray", 2030), new Car("black", 2014), new Car("blue", 1994));

    public static void main(String[] args) {
//        List<Car> grayCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equalsIgnoreCase("gray");
//            }
//        });


        List<Car> grayCars = filter(cars, car -> car.getColor().equalsIgnoreCase("gray"));
        List<Car> blueCars = filter(cars, car -> car.getColor().equalsIgnoreCase("blue"));
        List<Car> yearCars = filter(cars, car -> car.getYear() < 2015);
        System.out.println(grayCars);
        System.out.println(blueCars);
        System.out.println(yearCars);
    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
