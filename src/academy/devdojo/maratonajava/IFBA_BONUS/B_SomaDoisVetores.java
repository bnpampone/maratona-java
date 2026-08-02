package javacore.IFBA_BONUS;

import java.util.Arrays;

public class B_SomaDoisVetores {
    static void main(String[] args) {
        // b) Leia os elementos de dois vetores inteiros, de mesmo tamanho, em seguida, gere e imprima um vetor SOMA, onde seu elementos serão formados pela soma dos elementos de mesmos índices dos dois vetores lidos
        int[] vetor1 = {10,5,30};
        int[] vetor2 = {5,15,25};
        int[] vetorResultante = new int[3];

        if(vetor1.length != vetor2.length){
            return;
        } else{
            for (int i = 0; i < vetor1.length; i++) {
                    vetorResultante[i] = vetor1[i] + vetor2[i];
            }
            System.out.println(Arrays.toString(vetorResultante));
        }
    }
}
