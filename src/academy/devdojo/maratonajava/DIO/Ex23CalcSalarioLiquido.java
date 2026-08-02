package javacore.DIO;

import java.util.Scanner;

public class Ex23CalcSalarioLiquido {
    static void main(String[] args) {
        // 21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
        Scanner scanner = new Scanner(System.in);

        double valorHoraAula = scanner.nextDouble(); //
        double aulasLecionadas = scanner.nextDouble(); //
        double percentualDescontoINSS = scanner.nextDouble();
        double salarioResultante = (valorHoraAula * aulasLecionadas);
        double desconto = salarioResultante * percentualDescontoINSS/100;
        salarioResultante -= desconto;

        System.out.println(salarioResultante);
    }
}
