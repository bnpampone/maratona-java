package javacore.IFBA_BONUS;

import java.util.Arrays;
import java.util.Scanner;

public class A_Conjunto30Inteiros {
    static void main(String[] args) {
        // a) Ler e armazenar um conjunto de 30 números inteiros.
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[30];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(num));
    }
}
