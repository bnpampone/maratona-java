package javacore.POO.Variaveis_MetodosEstaticos.Incrementar;

public class Contador {
    private static int incrementador = 0;
    {
        incrementador++;
    }
    public static void zerar(){
        incrementador = 0;
    }

    public static int retornarContador(){
        return incrementador;
    }

    public static void incrementar(){
        incrementador++;
    }
}
