package javacore.DIO;

import java.util.Scanner;

public class Ex24CalcCombustivel {
    static void main(String[] args) {
        // 22 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
        //
        //Fórmula: distância = tempo x velocidade.
        //
        //            litros usados = distância / 12.
        Scanner scanner = new Scanner(System.in);


        int tempoViagem = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();
        int distancia = tempoViagem * velocidadeMedia;
        int litrosUsados = distancia/12;



    }
}
