package javacore.IFBA_PART2.GerenciadorDAgua;

public class CaixaDagua {
    private boolean isCaixaCheia;
    private  boolean isCaixaVazia;
    private int litros;
    private int capacidade;

    public CaixaDagua() {
        isCaixaVazia = true;
        isCaixaCheia = false;
        litros = 0;
        capacidade = 0;
    }

    public CaixaDagua(int capacidade) {
        isCaixaVazia = true;
        isCaixaCheia = false;
        litros = 0;
        this.capacidade = capacidade;
    }

    public CaixaDagua(boolean isCaixaCheia, boolean isCaixaVazia, int litros, int capacidade) {
        this.isCaixaCheia = isCaixaCheia;
        this.isCaixaVazia = isCaixaVazia;
        this.litros = litros;
        this.capacidade = capacidade;
    }

    public boolean isCaixaCheia() {
        return isCaixaCheia;
    }

    public void setCaixaCheia(boolean caixaCheia) {
        isCaixaCheia = caixaCheia;
    }

    public boolean isCaixaVazia() {
        return isCaixaVazia;
    }

    public void setCaixaVazia(boolean caixaVazia) {
        isCaixaVazia = caixaVazia;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

}
