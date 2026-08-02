package javacore.DIO;

import java.util.Scanner;

public class Ex04SucessorAnteiror {
    static void main(String[] args) {
        // 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

        Scanner scanner = new Scanner(System.in);

        int numberA = scanner.nextInt();

        System.out.println(numberA - 1 + " ANTECESSOR");
        System.out.println(numberA + 1 + " SUCESSOR");
    }
}
