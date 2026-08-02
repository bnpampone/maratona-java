package academy.devdojo.maratonajava.POO.IntroductionPOO.livro;

public class Livro {
    String nome;
    String autor;
    String editora;
    String dataPublicacao;
    String genero;
    String linguagemOriginal;
    int qntPaginas;

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", dataPublicacao='" + dataPublicacao + '\'' +
                ", genero='" + genero + '\'' +
                ", linguagemOriginal='" + linguagemOriginal + '\'' +
                ", qntPaginas=" + qntPaginas +
                '}';
    }
}
