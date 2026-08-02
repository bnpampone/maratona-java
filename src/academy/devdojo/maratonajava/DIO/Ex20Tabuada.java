package javacore.DIO;

import java.util.Scanner;

public class Ex20Tabuada {
    static void main(String[] args) {
        // 20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("======== TABUADA DO " + number + " ============");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
