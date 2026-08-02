package javacore.DIO;

import java.util.Scanner;

public class Ex17FahrenheitCelsius {
    static void main(String[] args) {
        // 17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
        //
        //Fórmula: C = (5 * ( F-32) / 9)
        Scanner scanner = new Scanner(System.in);

        double F = scanner.nextDouble();
        double Celcius = (5 * ( F-32) / 9);
        System.out.println("Fhrnt: " + F);
        System.out.println("Celcius: " + Celcius);
    }
}
