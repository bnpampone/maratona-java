package javacore.POO.Variaveis_MetodosEstaticos.CalculoTempo;

public class ConversaoDeUnidadesDeTempo {
    public static double MinPS(double mins){
        return mins * 60;
    }

    public static double HPM(double horas){
        return horas * 60;
    }

    public static double DPH(double dias){
        return dias * 24;
    }

    public static double SPD(double semana){
        return semana * 7;
    }

    public static double MPD(double mes){
        return mes * 30;
    }


}
