package javacore.POO.Variaveis_MetodosEstaticos.CalculoVolume;

public class ConversaoDeUnidadeVolume {
    public static double LparaMC(double litro){
        return litro * 1000;
    }

    public static double MCpL(double mc){
        return mc * 1000;
    }

    public static double MCpPes(double mc){
        return mc*35.32;
    }

    public static double GpPC(double g){
        return g*231;
    }


    public static double GpL(double g){
        return g*3785;
    }


}
