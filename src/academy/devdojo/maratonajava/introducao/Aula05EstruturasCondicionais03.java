package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 5000;
        String mensagem1 = "Vou doar 500 pro DevDojo";
        String mensagem2 = "Ainda não tenho condições, mas um dia vou ter!";
        String resultado = salario > 5000 ? mensagem1 : mensagem2;
        System.out.println(resultado);
    }
}
