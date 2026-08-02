package javacore.POO.IntroductionPOO.biblioteca;

public class LivroBiblioteca {
    String nome;
    String autor;
    String dataPubli;
    double preco;
    int qntPaginas;

    boolean isDisponivel;
    String dataEntrega;
    @Override
    public String toString() {
        return "LivroBiblioteca{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", dataPubli='" + dataPubli + '\'' +
                ", preco=" + preco +
                ", qntPaginas=" + qntPaginas +
                ", isDisponivel=" + isDisponivel +
                ", dataEntrega=" + dataEntrega +
                '}';
    }
}
