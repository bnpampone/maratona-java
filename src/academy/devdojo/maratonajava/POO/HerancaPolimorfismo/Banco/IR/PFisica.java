package javacore.POO.HerancaPolimorfismo.Banco.IR;

public class PFisica extends Contribuinte{

    @Override
    public double calcularImposto(){
        double aliquota;
        double parcela;
        double renda = this.getRendaBruta();
        if(renda <= 1400){
            return 0;
        } else if(renda > 1400 && renda <= 2100){
            aliquota = 0.1;
            parcela = 100;
            return (renda * aliquota) - parcela;
        } else if(renda > 2100 && renda <= 2800){
            aliquota = 0.15;
            parcela = 270;
            return (renda * aliquota) - parcela;
        } else if(renda > 2800 && renda <= 3600){
            aliquota = 0.25;
            parcela = 500;
            return (renda * aliquota) - parcela;
        }
            aliquota = 0.3;
            parcela = 700;
            return (renda * aliquota) - parcela;
    }

    @Override
    public String toString() {
        return "PFisica{" +
                "nome='" + nome + '\'' +
                ", rendaBruta=" + rendaBruta +
                ", imposto a ser pago: " + calcularImposto();

    }
}
