package javacore.POO.HerancaPolimorfismo.Banco.IR;

public class PJuridica extends Contribuinte{

    @Override
    public double calcularImposto (){
        return rendaBruta * 0.1;
    }

    @Override
    public String toString() {
        return "PJuridica{" +
                "nome='" + nome + '\'' +
                ", rendaBruta=" + rendaBruta +
                ", imposto a ser pago= " + calcularImposto();
    }
}
