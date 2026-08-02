package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private int idade;
    private int[] salario;
    private int soma = 0;


    public void imprimirDados() {
        if (salario == null) {
            return;
        }
            System.out.println("----------");
        System.out.println(this.nome);
        System.out.println(this.idade);
            for (int sal : salario) {
                System.out.println(sal + " ");
            }
        fazerMedia();

    }

    public void fazerMedia() {
        if (salario == null) {
            return;
        }
            for (int i = 0; i < salario.length; i++) {
                soma += salario[i];
            }
            System.out.println(soma /= salario.length);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSalario(int[] salario){
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int[] getSalario() {
        return salario;
    }

    public int getSoma() {
        return soma;
    }
}
