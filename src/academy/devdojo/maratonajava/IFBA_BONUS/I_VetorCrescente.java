package javacore.IFBA_BONUS;

import java.util.Arrays;

public class I_VetorCrescente {
    static void main(String[] args) {
        // i) Ler dois vetores ordenados (ordem crescente) de números inteiros e gerar um terceiro vetor, também ordenado, com os elementos dos vetores lidos.
        int[] vetor1 = {1,2,4,7};
        int[] vetor2 = {1,3,5,8,9};
        int[] vetor = new int[9];
        int temp = 0;

        for (int i = 0; i < vetor1.length + vetor2.length; i++) {
            if(vetor1[i] > vetor2[i]) {
                temp = vetor1[i];
                vetor1[i] = vetor2[i];
                vetor2[i] = temp;
            }
            vetor[i] = vetor1[i];
            vetor[i + 1] = vetor2[i];
            }
        System.out.println(Arrays.toString(vetor));

    }
}
