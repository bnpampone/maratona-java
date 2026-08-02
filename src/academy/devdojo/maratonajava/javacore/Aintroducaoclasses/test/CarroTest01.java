package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        System.out.println(carro);
        System.out.println(carro1);

        carro.nome = "Corolla";
        carro.ano = 2026;
        carro.modelo = "Sport Hybrid";
        carro1.nome = "BMW X6";
        carro1.ano= 2027;
        carro1.modelo = "ATUALIZADO";

        System.out.println("CARRO 1: " + carro.nome + " " + carro.ano +" " + carro.modelo);
        System.out.println("CARRO 2: " + carro1.nome + " " + carro.ano + " " + carro1.modelo);

    }
}
