package javacore.IFBA_BONUS;

import java.util.Arrays;

public class F_InverterVetor {
    static void main(String[] args) {
        // f) Ler um vetor de 20 números reais e inverter os elementos desse vetor no próprio vetor
        int[] vetorOriginal = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int aux = 0;


        for (int i = 0; i < vetorOriginal.length /2; i++) {
                aux = vetorOriginal[i];
                vetorOriginal[i] = vetorOriginal[vetorOriginal.length - 1 - i];
            vetorOriginal[vetorOriginal.length - 1 - i] = aux;
        }
        System.out.println(Arrays.toString(vetorOriginal));
    }
}
