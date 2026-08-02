package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante1.nome = "Midoriya";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Bakugo";
        estudante2.idade = 16;
        estudante2.sexo = 'M';

//        System.out.println(estudante1.nome);
//        System.out.println(estudante1.idade);
//        System.out.println(estudante1.sexo);
//
//        System.out.println("===============");
//
//        System.out.println(estudante2.nome);
//        System.out.println(estudante2.idade);
//        System.out.println(estudante2.sexo);

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

    }
}
