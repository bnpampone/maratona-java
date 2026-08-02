package javacore.IFBA_BONUS;

import java.util.Scanner;

public class G_LerEComparar {
    static void main(String[] args) {
        // g) Ler um vetor de 15 números inteiros. Em seguida, ler um conjunto de números inteiros (até que o usuário digitr 0) e, para cada número lido, imprimir se este existe ou não no vetor.
        int[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String resultado = "";

        while(number != 0){
            boolean encontrou = false;

            for (int i = 0; i < vetor.length; i++) {
                if(number == vetor[i]){
                    encontrou = true;
                }
            }
                if(encontrou){
                    resultado += number + " - EXISTE\n";
                } else{
                    resultado += number + " - NÃO EXISTE\n";
                }

                number = scanner.nextInt();
                 }
        System.out.println(resultado);
        }
}
