package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
        double valorParcelaIndividual = valorTotal / parcela;
        if(valorParcelaIndividual >= 1000){

            System.out.println("Valor PARCELA: " + valorParcelaIndividual + "QUANTIDADE DE PARCELAS " + parcela);
            }
        else{ continue;}
        }
    }
}
