package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte diaSemana = 5;
      // char, int, byte, short, enum, String
        switch (diaSemana){
            case 1:
                System.out.println("Doming");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terç");
                break;
            case 4:
                System.out.println("quart");
                break;
            case 5:
                System.out.println("quint");
                break;
            case 6:
                System.out.println("sext");
                break;
            case 7:
                System.out.println("sabad");
                break;
            default:
                System.out.println("Opção Invalida!");
        }
        char Sexo = 'f';
                switch(Sexo){
                    case 'f':
                        System.out.println("Sexo Feminino");
                        break;
                    case 'm':
                        System.out.println("Sexo Masculino");
                        break;
                    default:
                        System.out.println("Opção Invalida!");
                }
    }
}
