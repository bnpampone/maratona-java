package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte diaSemana = 1;
        switch (diaSemana){
            case 1:
                System.out.println("Dia = Domingo; FINAL DE SEMANA");
                break;
            case 2:
                System.out.println("Dia = SEGUNDA; DIA UTIL");
                break;
            case 3:
                System.out.println("Dia = TERÇA; DIA UTIL");
                break;
            case 4:
                System.out.println("Dia = QUARTA; DIA UTIL");
                break;
            case 5:
                System.out.println("Dia = QUINTA; DIA UTIL");
                break;
            case 6:
                System.out.println("Dia = SEXTA; DIA UTIL");
                break;
            case 7:
                System.out.println("Dia = SABAOD; FINAL DE SEMANA");
                break;
            default:
                System.out.println("OPÇ INVALIDA");
        }
    }
}
