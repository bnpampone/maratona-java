package javacore.POO.Metodos.estudante;

public class main {
    static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Neymar");
        aluno.setMatricula("20231ti40053");
        aluno.setCursoMatriculado("Informática");
        aluno.setDisciplinas(0, "Cloud Computing");
        aluno.setDisciplinas(1, "Estrutura de Dados");
        aluno.setDisciplinas(2, "Frameworks-SpringBoot");
        aluno.setNotas(0, 0, 9.1);
        aluno.setNotas(0, 1, 6);
        aluno.setNotas(0, 2, 5.5);

        aluno.setNotas(1, 0, 9);
        aluno.setNotas(1, 1, 10);
        aluno.setNotas(1, 2, 8);

        aluno.setNotas(2, 0, 7);
        aluno.setNotas(2, 1, 6);
        aluno.setNotas(2, 2, 9);
        
        
        aluno.mostrarDados();

        System.out.println("-----------------------------");

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            if(aluno.verificarSituacao(i)){
                System.out.println("Aluno APROVADO em " + aluno.disciplinas[i]);
            } else{
                System.out.println("Aluno REPROVADO em " + aluno.disciplinas[i]);
            }
        }

        System.out.println("-----------------------------");

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            System.out.println(i + " Media Numero " + aluno.obterMedia(i));
        }
    }
}
