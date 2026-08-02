package javacore.DIO;

import java.util.Scanner;

public class Ex01Leitura3Valores {
    static void main(String[] args) {
        // 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int somaAB = a + b;

        if (somaAB < c) {
            System.out.println("SOMA É MENOR QUE C");
        } else if (somaAB > c) {
            System.out.println("SOMA É MAIOR QUE C");
        } else {
            System.out.println("É IGUAL A C");
        }
    }
}
