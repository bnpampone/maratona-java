package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Av. Soares Lopes");
        endereco.setCep("45206-290");
        Pessoa pessoa = new Pessoa("Thorfin");
        pessoa.setEndereco(endereco);
        pessoa.setCpf("11111111111");

        pessoa.imprime();
        System.out.println("------------");

        Funcionario funcionario = new Funcionario("Naruto");
        funcionario.setCpf("02929292");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
