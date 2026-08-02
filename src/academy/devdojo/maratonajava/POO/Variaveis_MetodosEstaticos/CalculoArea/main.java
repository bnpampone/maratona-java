package javacore.POO.Variaveis_MetodosEstaticos.CalculoArea;

public class main {
    public static void main(String[] args) {
        imprimirDados(ConversaoDeUnidadeArea.AcrePPes(1));
        imprimirDados(ConversaoDeUnidadeArea.MetrosPPes(1));
        imprimirDados(ConversaoDeUnidadeArea.MilhaPAcres(1));
        imprimirDados(ConversaoDeUnidadeArea.PePCm(1));

    }
    public static void imprimirDados(double num){
        System.out.println(num);
    }
}
