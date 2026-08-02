package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] epsodios;

    static {
        System.out.println("Dentro do bloco de inicialização");
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++) {
            epsodios[i] += i+1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização 2");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estatico");
    }

    public Anime(String nome) {

        this.nome = nome;
    }

    public Anime(){
        for(int ep : Anime.epsodios){
            System.out.print(ep + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpsodios() {
        return epsodios;
    }
}
