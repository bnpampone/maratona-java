package javacore.POO.IntroductionPOO.livraria;

public class Livraria {
    String nome;
    String autor;
    String dataPubli;
    int qntPaginas;

    @Override
    public String toString() {
        return "Livraria{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", dataPubli='" + dataPubli + '\'' +
                ", qntPaginas=" + qntPaginas +
                '}';
    }
}
