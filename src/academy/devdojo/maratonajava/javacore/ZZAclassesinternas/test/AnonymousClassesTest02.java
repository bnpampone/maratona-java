package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BarcoNameComparator implements Comparator<Barco> {
    @Override
    public int compare(Barco barco, Barco t1) {
        return barco.getNome().compareTo(t1.getNome());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        barcos.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco barco, Barco t1) {
                return barco.getNome().compareTo(t1.getNome());
            }
        });

        System.out.println(barcos);
    }
}
