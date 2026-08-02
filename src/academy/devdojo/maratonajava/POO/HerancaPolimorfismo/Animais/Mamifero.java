package javacore.POO.HerancaPolimorfismo.Animais;

public class Mamifero extends Animal{
    private String alimento;
    public Mamifero() {
        super();
        this.ambiente = "Terra";

    }

    public Mamifero(String nome, double comprimento, int qntPatas, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, qntPatas, cor, ambiente, velocidade);
        this.ambiente = "Terra";

    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "nome='" + nome + '\'' +
                ", comprimento=" + comprimento +
                ", qntPatas=" + qntPatas +
                ", cor='" + cor + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", velocidade=" + velocidade +
                ", alimento=,'" + alimento +
                '}';
    }
}
