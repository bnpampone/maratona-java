package javacore.IFBA_PART2.Logistica;

public class Motorista extends Funcionario{
    protected String cnh;
    protected String categoria;

    public Motorista() {
    }

    public Motorista(int matricula, String nome, String ctps, int idade, String cnh, String categoria) {
        super(matricula, nome, ctps, idade);
        this.cnh = cnh;
        this.categoria = categoria;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "cnh='" + cnh + '\'' +
                ", categoria='" + categoria + '\'' +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", ctps='" + ctps + '\'' +
                ", idade=" + idade +
                '}';
    }
}
