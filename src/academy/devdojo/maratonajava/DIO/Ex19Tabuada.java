package javacore.DIO;

public class Ex19Tabuada {
    static void main(String[] args) {
        // 19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println("=========TABUADA DO " + i + " =========");
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
        }
    }
}
