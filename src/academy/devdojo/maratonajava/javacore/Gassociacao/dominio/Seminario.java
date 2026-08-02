package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] aluno;
//    private Professor2[] professor;
    private Local local;

    public Seminario(String titulo, Aluno[] aluno, Local local) {
        this.titulo = titulo;
        this.aluno = aluno;
        this.local = local;
    }

//    public Seminario(String titulo, Aluno[] aluno, Professor2[] professor, Local local) {
//        this.titulo = titulo;
//        this.aluno = aluno;
//        this.professor = professor;
//        this.local = local;
//    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }
}
