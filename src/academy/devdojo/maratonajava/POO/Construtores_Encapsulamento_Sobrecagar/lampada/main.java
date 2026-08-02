package javacore.POO.Construtores_Encapsulamento_Sobrecagar.lampada;

public class main {
    static void main(String[] args) {
        Lampada lampada = new Lampada("KNCR11", "Moderna", 255, false);

        lampada.desligar();
        lampada.mostrarEstado();
        lampada.ligar();
    }
}
