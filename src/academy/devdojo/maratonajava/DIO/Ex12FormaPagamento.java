package javacore.DIO;

import java.util.Scanner;

public class Ex12FormaPagamento {
    static void main(String[] args) {
        //  12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
        //
        // pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
        //
        // Tabela de Código de Condições de Pagamento
        // 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
        //
        // 2 - À Vista no cartão de crédito, recebe 10% de desconto
        //
        // 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
        //
        // 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

        Scanner scanner = new Scanner(System.in);

        double valorPago = scanner.nextDouble();
        int escolha = scanner.nextInt();
        double valorPix = 0.15;
        double valorCredito = 0.1;
        double valorParcel = 0.5;
        double valorParcel2 = 1.1;
        double valorResultante = 0;

        switch(escolha){
            case 1:
                valorResultante = valorPago - valorPago * valorPix;
                System.out.println(valorResultante);
                break;
            case 2:
                valorResultante = valorPago - valorPago * valorCredito;
                System.out.println(valorResultante);
                break;
            case 3:
                valorResultante = (valorPago * valorParcel) * 2;
                System.out.println(valorResultante);
                break;
            case 4:
                valorResultante = valorPago * valorParcel2;
                System.out.println(valorResultante);
                break;
            default:
                System.out.println("VALOR NÃO ACEITO");
        }
    }
}
