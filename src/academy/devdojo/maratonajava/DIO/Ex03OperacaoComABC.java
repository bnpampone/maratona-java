package javacore.DIO;

import java.util.Scanner;

public class Ex03OperacaoComABC {
    static void main(String[] args) {
        // 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
        //
        //caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
        //
        //imprimir seu valor na tela.

        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int C = 0;
        if(numberA == numberB){
            C = numberA + numberB;
        } else if (numberA != numberB) {
            C = numberA * numberB;
        }
        System.out.println(C);
    }
}
