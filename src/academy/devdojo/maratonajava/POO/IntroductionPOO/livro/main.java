package academy.devdojo.maratonajava.POO.IntroductionPOO.livro;

public class main {
    static void main(String[] args) {
        Livro livro = new Livro();
        livro.autor = "Augusto Galego";
        livro.dataPublicacao = "21/01/2027";
        livro.editora = "Moderna";
        livro.genero = "Progamação";
        livro.nome = "Programador Pragmatico";
        livro.linguagemOriginal = "Português/Brasil";
        livro.qntPaginas = 255;

        System.out.println(livro);
    }
}
