package javacore.IFBA_BONUS;

import java.util.Arrays;
import java.util.Scanner;

public class E_MaiorEMenor {
    static void main(String[] args) {
        // e)Ler um vetor de 10 números inteiros e imprimir as posições do maior e do menor elemento do vetor. Assuma que existem elementos repetidos no vetor.
        Scanner scanner = new Scanner(System.in);
        int[] vetorInteiros = new int[10];
        for (int i = 0; i < vetorInteiros.length; i++) {
            vetorInteiros[i] = scanner.nextInt();
        }
        int maior = vetorInteiros[0];
        int menor = vetorInteiros[0];

        for (int i = 0; i < vetorInteiros.length - 1; i++) {

            if(maior < vetorInteiros[i + 1]){
                maior = vetorInteiros[i + 1];

            }
            if(menor > vetorInteiros[i + 1]){
                menor = vetorInteiros[i + 1];
            }
        }

        System.out.println(Arrays.toString(vetorInteiros));

        for (int i = 0; i < vetorInteiros.length; i++) {
            if(vetorInteiros[i] == maior){
                System.out.println("Posição Maior: " + i);
            }

            if(vetorInteiros[i] == menor){
                System.out.println("Posição Menor: " + i);
            }
        }
    }
}
