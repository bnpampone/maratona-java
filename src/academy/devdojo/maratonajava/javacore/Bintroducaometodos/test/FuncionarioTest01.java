package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sasuke");
        funcionario.setIdade(14);
        funcionario.setSalario(new int[] {1000, 2000, 7000});
        funcionario.imprimirDados();
        }
}
