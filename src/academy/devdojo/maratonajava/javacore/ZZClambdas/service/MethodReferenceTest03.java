package academy.devdojo.maratonajava.javacore.ZZClambdas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTest03 {
    // Reference to an instance method of an arbitrary object a particular type
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Rimuru", "Zabuza", "Veldora", "Hakimaru"));
        names.sort(String::compareTo);
//        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(names);

        Function<String, Integer> numStringToInteger = s -> Integer.parseInt(s);
//        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("10");
        System.out.println(num);

//        BiPredicate<List<String>, String> checkName = List::contains;
        BiPredicate<List<String>, String> checkName = (l, o) -> l.contains(o);
        System.out.println(checkName.test(names, "Rimuru"));
    }
}
