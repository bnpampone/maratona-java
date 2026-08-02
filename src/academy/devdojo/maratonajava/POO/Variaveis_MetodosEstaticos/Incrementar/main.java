package javacore.POO.Variaveis_MetodosEstaticos.Incrementar;

public class main {
    public static void imprimirValor() {
        System.out.println(Contador.retornarContador());
    }

    static void main(String[] args) {

        imprimirValor();
        Contador.incrementar();
        imprimirValor();

        Contador.zerar();
        imprimirValor();

        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        imprimirValor();

        Contador contador = new Contador();
        Contador contador2 = new Contador();

        imprimirValor();
    }
}
