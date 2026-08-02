package academy.devdojo.maratonajava.introducao;

    public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double taxa1 = 0.097;
        double taxa2 = 0.3735;
        double taxa3 = 0.495;
        float salario = 70000;
        if(salario >= 0 && salario <= 34712){
            System.out.println("Você deve pagar a taxa" + taxa1);
            System.out.println(salario * taxa1);
        }
        else if(salario >=34713 && salario<=68507){
            System.out.println("Você deve pagar a taxa" + taxa2);
            System.out.println(salario * taxa2);
        }
        else{
            System.out.println("Você deve pagar a taxa" + taxa3);
            System.out.println(salario * taxa3);
        }
    }
}
