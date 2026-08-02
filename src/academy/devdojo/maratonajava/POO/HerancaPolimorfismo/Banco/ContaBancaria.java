package javacore.POO.HerancaPolimorfismo.Banco;

public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double num) {
        if(num > saldo){
            return false;
        }
        saldo -= num;
        return true;
    }

    public double depositar(double num){
        System.out.println("Deposito realizado com sucesso no valor de " + num + ". Novo saldo de " + getSaldo());
        return saldo+=num;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }
}
