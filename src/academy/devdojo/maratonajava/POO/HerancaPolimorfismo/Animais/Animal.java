package javacore.POO.HerancaPolimorfismo.Animais;

public abstract class Animal {
    protected String nome;
    protected double comprimento;
    protected int qntPatas;
    protected String cor;
    protected String ambiente;
    protected double velocidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getQntPatas() {
        return qntPatas;
    }

    public void setQntPatas(int qntPatas) {
        this.qntPatas = qntPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public Animal(String nome, double comprimento, int qntPatas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.qntPatas = 4;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public Animal() {
        this.qntPatas = 4;

    }


}
