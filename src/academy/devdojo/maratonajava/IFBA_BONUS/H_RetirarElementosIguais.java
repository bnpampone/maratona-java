package javacore.IFBA_BONUS;

import java.util.Arrays;

public class H_RetirarElementosIguais {
    static void main(String[] args) {
        // h) Ler um vetor e gerar um segundo vetor com os elementos do vetor lido menos os elementos repetidos. Ex : VetorLido = 5 1 2 7 5 3 7 5 9  3; VetorGerado = 5 1 2 7 3 9
        int[] array = {2,5,4,5,7,8,2,9,4,4};
        int[] newArray = new int[array.length];
        int pos = 0;

        for (int i = 0; i < array.length; i++) {

            boolean repetido = false;

            for (int j = 0; j < i; j++) {

                if (array[i] == array[j]) {
                    repetido = true;
                    break;
                }
            }
                if(!repetido){
                    newArray[pos] = array[i];
                    pos++;
                }
            }

        System.out.println(Arrays.toString(newArray));
    }
}
