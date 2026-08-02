package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor2;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

import java.util.Scanner;

public class SeminariosTest01 {
    public static void main(String[] args) {
        Local local = new Local("UESC");
        Aluno aluno1 = new Aluno("Bê", 18);
        Aluno aluno2 = new Aluno("Momoreco", 18);
        Aluno[] aluno = {aluno1, aluno2};
        Professor2 professor1 = new Professor2("Leila", "Ética");
        Professor2[] professores = {professor1};
        Seminario seminario = new Seminario("Ciências da Computação", aluno, local);
        Seminario[] seminarios = {seminario};
        professor1.setSeminario(seminarios);


        professor1.newimprime();
    }
}
