package javacore.DIO;

import java.util.Scanner;

public class Ex07TrueORFalse {
    static void main(String[] args) {
        // 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

        Scanner scanner = new Scanner(System.in);

        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();

        if(a && b){
            System.out.println("AMBOS SÃO VERDADEIROS");
        } else if(!a && !b){
            System.out.println("AMBOS NÃO SÃO VERDADEIROS");
        } else {
            System.out.println("AO MENOS UM É FALSO");
        }
    }
}
