package javacore.DIO;

import java.util.Scanner;

public class Ex16Triangulo {
    static void main(String[] args) {
        // 16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
        //
        //equilátero, isósceles ou escaleno.

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a + b > c && a + c > b && b + c > a){
            System.out.println("É TRIANGULO");
            if(a == b && a == c){
                System.out.println("EQUILATERO");
            } else if (a == b && a != c || a != b && a == c) {
                System.out.println("ISOCELES");
            } else if (a != b && a != c) {
                System.out.println("ESCALENO");
            }
        } else{
            System.out.println("NÃO É TRIANGULO");
        }
    }
}
