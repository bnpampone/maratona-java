package javacore.DIO;

import java.util.Scanner;

public class Ex22QuocienteResto {
    static void main(String[] args) {
        // 22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int quociente = numA/numB;
        int resto = numA % numB;
        System.out.println(quociente);
        System.out.println(resto);
    }
}
