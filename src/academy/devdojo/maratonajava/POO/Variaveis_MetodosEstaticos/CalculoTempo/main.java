package javacore.POO.Variaveis_MetodosEstaticos.CalculoTempo;

public class main {
    public static void main(String[] args) {
      imprimirDados(ConversaoDeUnidadesDeTempo.MinPS(1));
      imprimirDados(ConversaoDeUnidadesDeTempo.DPH(1));
      imprimirDados(ConversaoDeUnidadesDeTempo.HPM(1));
      imprimirDados(ConversaoDeUnidadesDeTempo.MPD(1));
      imprimirDados(ConversaoDeUnidadesDeTempo.SPD(1));
    }
    public static void imprimirDados(double num){
        System.out.println(num);
    }
}
