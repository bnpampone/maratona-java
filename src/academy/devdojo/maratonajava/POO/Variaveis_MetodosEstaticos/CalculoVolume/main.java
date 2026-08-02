package javacore.POO.Variaveis_MetodosEstaticos.CalculoVolume;

public class main {
    public static void main(String[] args) {
        imprimirDados(ConversaoDeUnidadeVolume.LparaMC(1));
        imprimirDados(ConversaoDeUnidadeVolume.MCpL(1));
        imprimirDados(ConversaoDeUnidadeVolume.GpL(1));
        imprimirDados(ConversaoDeUnidadeVolume.GpPC(1));
        imprimirDados(ConversaoDeUnidadeVolume.MCpPes(1));
    }

    public static void imprimirDados(double num) {
        System.out.println(num);
    }
}

