package javacore.DIO;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08ImprimaDecrescente {
    static void main(String[] args) {
        // 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] colecao = {a,b,c};
        int temp = 0;

        for (int j = 0; j < colecao.length; j++) {
            for (int i = 0; i < colecao.length - 1; i++) {
                if (colecao[i] < colecao[i + 1]) {
                    temp = colecao[i];
                    colecao[i] = colecao[i + 1];
                    colecao[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(colecao));
    }
}
