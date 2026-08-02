package javacore.POO.Construtores_Encapsulamento_Sobrecagar.lampada;

public class Lampada {
    String nomeLampada;
    String marcaLampada;
    int voltagem;
    boolean isLampadaLigada;

    public Lampada(String nomeLampada, String marcaLampada, int voltagem, boolean isLampadaLigada) {
        this.nomeLampada = nomeLampada;
        this.marcaLampada = marcaLampada;
        this.voltagem = voltagem;
        this.isLampadaLigada = isLampadaLigada;
    }

    public void ligar(){
        if(isLampadaLigada){
            System.out.println("Lampada Já esta ligada");
        }
        isLampadaLigada = true;
        System.out.println("Lampada LIGADA");

    }

    public void desligar(){
        if(!isLampadaLigada){
            System.out.println("Lampada Já esta desligada");
        }
        isLampadaLigada = false;
        System.out.println("Lampada DESLIGADA");
    }

    public void mostrarEstado(){
        if(isLampadaLigada){
            System.out.println("LIGADA");
        } else if (!isLampadaLigada) {
            System.out.println("DESLIGADA");
        }
    }
}
