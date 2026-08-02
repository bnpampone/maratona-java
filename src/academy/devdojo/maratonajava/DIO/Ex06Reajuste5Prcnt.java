package javacore.DIO;

import java.util.Scanner;

public class Ex06Reajuste5Prcnt {
    static void main(String[] args) {
        // 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double reajuste = 0.05;
        double resutaldo = a + a * reajuste;
        System.out.println(resutaldo);
    }
}
