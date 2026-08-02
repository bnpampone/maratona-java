package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x");
        String s = input.nextLine();
        if(s.charAt(0) == ' '){
            System.out.println("SIM");
        } else{
            System.out.println("NÃO");
        }
    }
}
