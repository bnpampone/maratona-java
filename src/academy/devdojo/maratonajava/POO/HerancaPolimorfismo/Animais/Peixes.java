package javacore.POO.HerancaPolimorfismo.Animais;

public class Peixes extends Animal{

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    private String caracteristica;

    public Peixes(String nome, double comprimento, int qntPatas, String cor, String ambiente, double velocidade, String caracteristica) {
        super(nome, comprimento, qntPatas, cor, ambiente, velocidade);
        this.cor = "Cinzento";
        this.ambiente = "Mar";
        this.qntPatas = 0;
        this.caracteristica = "Barbatanas e Caudas";
    }

    public Peixes() {
        super();
        this.cor = "Cinzento";
        this.ambiente = "Mar";
        this.qntPatas = 0;
        this.caracteristica = "Barbatanas e Caudas";
    }

    @Override
    public String toString() {
        return "Peixes{" +
                "caracteristica='" + caracteristica + '\'' +
                ", nome='" + nome + '\'' +
                ", comprimento=" + comprimento +
                ", qntPatas=" + qntPatas +
                ", cor='" + cor + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
