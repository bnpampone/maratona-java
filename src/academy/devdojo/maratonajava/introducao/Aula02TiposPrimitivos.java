package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
    // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000l;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte  idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;
        String nome = "Goku";
        System.out.println("A idade é " + idade);
        System.out.println(caractere);
        System.out.println("Oi meu nome é " + nome);
    }
}
