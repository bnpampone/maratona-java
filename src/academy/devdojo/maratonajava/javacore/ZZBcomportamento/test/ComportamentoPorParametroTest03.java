package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
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

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T t : list) {
            if(predicate.test(t)){
                filteredList.add(t);
            }
        }
        return filteredList;

    }
}
