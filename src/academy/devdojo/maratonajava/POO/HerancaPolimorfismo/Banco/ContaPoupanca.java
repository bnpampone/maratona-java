package javacore.POO.HerancaPolimorfismo.Banco;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }


    public boolean calcularNovoSaldo(double num, int diaHoje){
        if(diaHoje == diaRendimento) {
            this.setSaldo(this.getSaldo() + (this.getSaldo() * (num / 100)));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaRendimento=" + diaRendimento +
                "; " + super.toString() +
                '}';
    }
}
