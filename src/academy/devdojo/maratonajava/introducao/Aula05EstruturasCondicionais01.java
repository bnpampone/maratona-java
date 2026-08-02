package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizhed = idade >= 18;
        if(isAutorizhed){
            System.out.println("Liberado");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
//        if(!isAutorizhed){
//            System.out.println("Não autorizado a comprar bebida alcólica");
//        }
        boolean c = false;
        if(c == true){
            System.out.println("Exemplo brabo");
        }
    }
}
