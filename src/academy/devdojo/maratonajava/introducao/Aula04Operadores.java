package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        double result = num1 / (double) num2;
        System.out.println(result);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezMaiorIgualQueVinte = 10>=20;
        boolean isDezMenorIgualQueVinte = 10<=20;
        boolean isDezIgualQueVinte = 10==20;
        boolean isDezDiferenteQueVinte = 10!=20;

        System.out.println(isDezMaiorQueVinte + " FALSE");
        System.out.println(isDezMenorQueVinte + " TRUE");
        System.out.println(isDezMaiorIgualQueVinte + " FALSE");
        System.out.println(isDezMenorIgualQueVinte + " TRUE");
        System.out.println(isDezIgualQueVinte + " FALSE");
        System.out.println(isDezDiferenteQueVinte + " TRUE");

        // && (AND), || (OR), !
        int idade = 35;
        float salario = 3300;
        boolean isDentroLei = idade > 30 && salario > 4600;
        boolean isMenorLei = idade < 30 && salario < 3300;
        System.out.println(isDentroLei);
        System.out.println(isMenorLei);


        double valorTotalContaCorrente = 500;
        double valorTotalContaPoupaça = 10000;
        float valorPlayStation = 5000;
        boolean isPlayCompravel = valorTotalContaCorrente >= valorPlayStation || valorTotalContaPoupaça >= valorPlayStation;
        System.out.println("isPlayCompravel " + isPlayCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        System.out.println(contador);
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
    }
}
