package javacore.POO.Metodos.jogo;

public class JogoDaVelha {
    char[][] tabuleiro = new char[3][3];
    int jogada = 1;

    public void inicializarTabuleiro(){
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    public void imprimirTabuleiro(){
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + "    ");
            }
            System.out.println();
        }
    }

    boolean verificarJogada(int linha, int coluna, char simbolo){
         if(tabuleiro[linha][coluna] == '-'){
            tabuleiro[linha][coluna] = simbolo;
            jogada++;
            return true;
        } else {
            return false;
        }
    }

    public boolean vezJogador1(){
        if (jogada % 2 == 1) {
            return true; // X
        } else{
            return false; // O
        }
    }

    public boolean verificarGanhador(char simbolo){
        if((tabuleiro[0][0] == simbolo && tabuleiro[0][1] == simbolo && tabuleiro[0][2] == simbolo ||
                tabuleiro[1][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[1][2] == simbolo ||
                tabuleiro[2][0] == simbolo && tabuleiro[2][1] == simbolo && tabuleiro[2][2] == simbolo ||
                tabuleiro[0][0] == simbolo && tabuleiro[1][0] == simbolo && tabuleiro[2][0] == simbolo ||
                tabuleiro[0][1] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][1] == simbolo ||
                tabuleiro[0][2] == simbolo && tabuleiro[1][2] == simbolo && tabuleiro[2][2] == simbolo ||
                tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo ||
                tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo)){
            return true;
        }
        return false;
    }
}
