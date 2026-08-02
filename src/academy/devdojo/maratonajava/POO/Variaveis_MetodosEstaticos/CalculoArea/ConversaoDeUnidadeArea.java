package javacore.POO.Variaveis_MetodosEstaticos.CalculoArea;

public class ConversaoDeUnidadeArea {
    int metros;

    public static double MetrosPPes(double metros){
        double pes2 = 10.76;
        return pes2 * metros;
    }

    public static double PePCm(double pes2){
        double cm = 929;
        return cm * pes2;
    }

    public static double MilhaPAcres(double milha){
        double acres = 640;
        return acres * milha;
    }

    public static double AcrePPes(double acre){
        double pes2 = 45650;
        return acre * pes2;
    }
}
