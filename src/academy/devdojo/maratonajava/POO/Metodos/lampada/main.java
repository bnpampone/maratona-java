package javacore.POO.Metodos.lampada;

public class main {
    static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.nome = "NEW-LIGHT";
        lampada.marca = "Kingston";
        lampada.validade = "31/05/2027";
        lampada.voltagem = 255;
        lampada.status = false;

        System.out.println(lampada);

        lampada.mostrarStatus();
        lampada.inverterStatus();
        lampada.ligar();
        lampada.desligar();
        lampada.ligar();
        lampada.inverterStatus();
    }
}
