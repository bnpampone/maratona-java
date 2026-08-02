package javacore.POO.Construtores_Encapsulamento_Sobrecagar.estudante;

public class Aluno {
    private String nome;
    private String matricula;
    private String cursoMatriculado;
    private String[] disciplinas = new String[3];
    private double[][] notas = new double[3][3];

    public Aluno() {
    }

    public Aluno(String nome, String matricula, String cursoMatriculado, String[] disciplinas, double[][] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.cursoMatriculado = cursoMatriculado;
        this.disciplinas = disciplinas;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(int indice, String disciplinas) {
        this.disciplinas[indice] = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(int disciplina, int indice, double notas) {
        this.notas[disciplina][indice] = notas;
    }


    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Curso Matriculado: " + this.cursoMatriculado);
        for (int i = 0; i < disciplinas.length; i++) {
            System.out.print(i + " ======= " + disciplinas[i] + ": ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();

        }
    }


    public double obterMedia(int disciplina) {
        double soma = 0;

        for (int i = 0; i < notas[disciplina].length; i++) {
            soma += notas[disciplina][i];
        }

        soma /= notas[disciplina].length;
        return soma;
    }


    public boolean verificarSituacao(int disciplina) {
        if (obterMedia(disciplina) >= 7) {
            return true;
        } else {
            return false;
        }

    }
}


