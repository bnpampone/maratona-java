package javacore.IFBA_BONUS;

import java.util.Arrays;
import java.util.Scanner;

public class C_CharaterIMPARePAR {
    static void main(String[] args) {
        // c) Ler um vetor de caracteres de tamanho 20 e imprimir os caracteres das posições PARES e em seguida os caracteres das posições ÍMPARES.
        Scanner scanner = new Scanner(System.in);

        char[] caracter = new char[20];
        for (int i = 0; i < caracter.length; i++) {
            caracter[i] = scanner.next().charAt(0);
        }

        System.out.println("====PARES=====");
        for (int i = 0; i < caracter.length; i++) {
            if (i % 2 == 0) {
                System.out.print(caracter[i] + " ");
            }
        }
        System.out.println();
        System.out.println("====IMPARES====");
        for (int i = 0; i < caracter.length; i++) {
            if (i % 2 != 0) {
                System.out.print(caracter[i] + " ");
            }
        }
    }
}
