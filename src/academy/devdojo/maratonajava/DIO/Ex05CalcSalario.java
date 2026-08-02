package javacore.DIO;

import java.util.Scanner;

public class Ex05CalcSalario {
    static void main(String[] args) {
        // 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
        //
        //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

        Scanner scanner = new Scanner(System.in);
        double salarioMinimo = 1293.20;
        double salarioUsuario = scanner.nextDouble();
        double salarioResultante = salarioUsuario/salarioMinimo;
        System.out.println(salarioResultante + " Salarios");
    }
}
