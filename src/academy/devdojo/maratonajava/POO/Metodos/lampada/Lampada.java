package javacore.POO.Metodos.lampada;

import javax.swing.plaf.PanelUI;

public class Lampada {
    String nome;
    String marca;
    int voltagem;
    String validade;
    boolean status;

    @Override
    public String toString() {
        return "Lampada{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", voltagem=" + voltagem +
                ", validade='" + validade + '\'' +
                ", status=" + status +
                '}';
    }

    public void ligar(){
        if(status == true){
            System.out.println("LAMPADA JÁ ESTA LIGADA");
        } else {
            status = true;
            System.out.println("LIMPADA LIGADA!");
        }
    }

    public void desligar(){
        if(status == false){
            System.out.println("LAMPADA JÁ ESTÁ DESLIGAD!");
        } else{
            status = false;
            System.out.println("LAMPADA DESLIGADA!");
        }
    }

    public void inverterStatus(){
        if (status == true) {
            status = false;
            System.out.println("LAMPADA DESLIGADA");
        }
        else{
            status = true;
            System.out.println("LAMPADA LIGADA");
        }
    }

    public void mostrarStatus(){
        if(status){
            System.out.println("LIGADA!");
        }
        else{
            System.out.println("DESLIGADA!");
        }
    }
}
