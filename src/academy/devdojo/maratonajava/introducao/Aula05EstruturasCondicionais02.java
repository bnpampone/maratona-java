package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 45;
        String categoria;
        if(idade < 15){
//            System.out.println("Você pertence a categoría de infantil");
            categoria = "Infantil";
        }
        else if(idade >= 15 && idade < 18){
//            System.out.println("Você pertence a categoría de juvenil");
            categoria = "Juvenil";
        }
        else{
//            System.out.println("Você pertence a categoría de adultos");
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}
