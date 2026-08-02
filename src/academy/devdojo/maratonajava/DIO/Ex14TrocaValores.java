package javacore.DIO;

import java.util.Scanner;

public class Ex14TrocaValores {
    static void main() {
        // 14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
        Scanner scanner = new Scanner(System.in);

        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int temp = 0;

        System.out.println("VALOR ORIGINAL DE A & B: " + numberA + " " + numberB);

        temp = numberA;
        numberA = numberB;
        numberB = temp;
        System.out.println("VALOR ALTERADO DE A & B: " + numberA + " " + numberB);
    }
}
