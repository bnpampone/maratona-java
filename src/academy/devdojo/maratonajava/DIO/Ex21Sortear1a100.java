package javacore.DIO;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Ex21Sortear1a100 {
    static void main(String[] args) {
        // 21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.


        int num = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println(num);


    }
}
