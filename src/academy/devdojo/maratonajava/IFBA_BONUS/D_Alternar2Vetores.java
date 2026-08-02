package javacore.IFBA_BONUS;

import java.util.Arrays;

public class D_Alternar2Vetores {
    static void main(String[] args) {
        // d) Ler dois vetores de mesmo tamanho armazenar seus elementos alternadamente em um terceiro vetor.
        int[] vetor1 = {10, 20, 30};
        int[] vetor2 = {5, 15, 25};
        int[] vetorResultante = new int[6];

        if (vetor1.length != vetor2.length) {
            return;
        } else {
            for (int i = 0; i < vetor1.length; i++) {
                for (int j = 0; j < vetor1.length; j++) {
                    vetorResultante[2 * i] = vetor1[i];
                    vetorResultante[2 * i + 1] = vetor2[i];
                }
            }
            System.out.println(Arrays.toString(vetorResultante));
        }
    }
}
