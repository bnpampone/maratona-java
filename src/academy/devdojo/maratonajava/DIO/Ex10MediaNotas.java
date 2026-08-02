package javacore.DIO;

import java.util.Scanner;

public class Ex10MediaNotas {
    static void main(String[] args) {
        //  10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

        Scanner scanner = new Scanner(System.in);

        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();
        int nota3 = scanner.nextInt();
        int media = (nota1 + nota2 + nota3)/3;
        System.out.println(media);
    }
}
