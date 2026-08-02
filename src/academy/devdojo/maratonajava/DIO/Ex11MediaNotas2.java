package javacore.DIO;

import java.util.Scanner;

public class Ex11MediaNotas2 {
    static void main(String[] args) {
        // 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
        //
        // se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

        Scanner scanner = new Scanner(System.in);

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("media: " + media);
        if(media >= 7){
            System.out.println("APROVADO");
        }else {
            System.out.println("REPROVADO");
        }
    }
}
