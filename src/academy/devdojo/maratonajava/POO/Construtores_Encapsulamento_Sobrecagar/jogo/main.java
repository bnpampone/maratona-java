package javacore.POO.Construtores_Encapsulamento_Sobrecagar.jogo;

import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();

        boolean ganhou = false;
        char simbolo;

        System.out.println("Jogador 1 => X");
        System.out.println("Jogador 2 => O");
        jogo.inicializarTabuleiro();

        while (!ganhou) {
            jogo.imprimirTabuleiro();

            if (jogo.vezJogador1()) {
                System.out.println("Vez Jogador 1 => X");
                simbolo = 'X';
            } else {
                System.out.println("Vez Jogador 2 => O");
                simbolo = 'O';
            }

            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();
            if((linha < 0 || linha > 2) || ((coluna < 0 || coluna > 2))) {
                System.out.println("Posição Invalida!");
                continue;
            }
                if (!jogo.verificarJogada(linha, coluna, simbolo)) {
                System.out.println("Posição OCUPADA!");
            } else {
                if (jogo.verificarGanhador('X')) {
                    ganhou = true;
                    System.out.println("Jogador 1 GANHOU A RODADA");
                    jogo.imprimirTabuleiro();
                } else if (jogo.verificarGanhador('O')) {
                    ganhou = true;
                    System.out.println("Jogador 2 GANHOU A RODADA");
                    jogo.imprimirTabuleiro();
                } else if (jogo.getJogada() > 9) {
                    ganhou = true;
                    System.out.println("NINGUEM GANHOU O JOGO");
                    jogo.imprimirTabuleiro();
                }
            }
        }

    }
}
