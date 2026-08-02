package javacore.IFBA_PART2.Logistica;

public abstract class Funcionario {
    protected int matricula;
    protected String nome;
    protected String ctps;
    protected int idade;

    public Funcionario(){

    }

    public Funcionario(int matricula, String nome, String ctps, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.ctps = ctps;
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
