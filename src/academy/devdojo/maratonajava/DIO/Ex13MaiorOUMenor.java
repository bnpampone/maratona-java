package javacore.DIO;

import java.util.Scanner;

public class Ex13MaiorOUMenor {
    static void main(String[] args) {
        //  13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        int idade = scanner.nextInt();

        if(idade < 18){
            System.out.println(nome + " É MENOR DE IDADE");
        }else{
            System.out.println(nome + " É MAIOR DE IDADE");
        }

    }
}
