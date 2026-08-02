package javacore.DIO;

import java.util.Scanner;

public class Ex02ImparParPositivoNegativo {
    static void main(String[] args) {
       // 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();

       if(number % 2 == 0){
           System.out.println("PAR");
       }else{
           System.out.println("IMPAR");
       }
       if(number > 0){
           System.out.println("POSITIVO");
       } else{
           System.out.println("NEGATIVO");
       }
    }
}
