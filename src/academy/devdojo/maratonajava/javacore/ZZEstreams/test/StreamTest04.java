package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();

        List<String> graphicDesigners = List.of("Breno Pamponé", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("Breno", "William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");

        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo){
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("================");

        devdojo.stream()
                .flatMap(l -> l.stream()).forEach(s -> System.out.println(s));

    }
}
