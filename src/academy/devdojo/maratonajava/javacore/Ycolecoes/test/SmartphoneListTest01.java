package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("1ABC1", "iPhone");
        Smartphone phone2 = new Smartphone("22222", "Pixel");
        Smartphone phone3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(phone1);
        smartphones.add(phone2);
        smartphones.add(0, phone3);

        for(Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }

        Smartphone phone4 = new Smartphone("22222", "Pixel");

        System.out.println(smartphones.contains(phone4));
        int indexSmartphone4 = smartphones.indexOf(phone4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
