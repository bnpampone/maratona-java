package javacore.POO.Construtores_Encapsulamento_Sobrecagar.bancaria;

public class ContaCorrente {
    private int numero;
    private double saldo;
    private boolean isEspecial;
    private double limite;

    public ContaCorrente(int numero, double saldo, boolean isEspecial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.isEspecial = isEspecial;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isEspecial() {
        return isEspecial;
    }

    public double getLimite() {
        return limite;
    }

    public void realizarSaque(double valorSaque){

        if(saldo >= valorSaque){
            saldo -= valorSaque;
            verificarEspecial(valorSaque);
            System.out.println("Saque AUTORIZADO no valor de " + valorSaque + " Saldo atual de " + saldo);
        } else {
            System.out.println("Saque NÃO AUTORIZADO");
        }
    }

    public void realizarDeposito(double valorDeposito){
        if(valorDeposito > 0){
            saldo += valorDeposito;
            System.out.println("DEPOSITO REALIZADO COM SUCESSO O VALOR DE " + valorDeposito + " SALDO DISPONIVEL DE " + saldo);
        } else {
            System.out.println("Valor Inválido");
        }
    }

    public void consultarSaldo(){
        System.out.println("Valor do SALDO é de " + this.saldo);
    }

    private void verificarEspecial(double valorSaque) {
        if (isEspecial) {
            double cashback = valorSaque * 0.1;
            saldo += cashback;

            System.out.println("===== CLIENTE ESPECIAL ======");
            System.out.println("Seu saque recebeu 10% de cashback!");
            System.out.println("Valor do cashback: " + cashback);
        }
    }


    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", isEspecial=" + isEspecial +
                ", limite=" + limite +
                '}';
    }
}
