package javacore.POO.Metodos.conta;

public class ContaCorrente {
    int numero;
    double saldo;
    boolean isEspecial;
    double limite;

    public void saque(int valorSaque) {
        System.out.println("====== SACAR ======");

        if (saldo >= valorSaque) {
            saldo -= valorSaque;

            System.out.println("SAQUE REALIZADO COM SUCESSO! No valor de " + valorSaque);
            verificarEspecial(valorSaque);

            System.out.println("Quantidade disponível em conta: " + saldo);
        }
    }

    public void depositar(int valorDeposito) {
        System.out.println("======= DEPOSITAR =====");

        saldo += valorDeposito;
        System.out.println("Valor de " + valorDeposito + " DEPOSITADO com SUCESSO! \n Quantidade Disponivel em conta é de: " + saldo);
    }

    public void consultarSaldo() {
        System.out.println("===== CONSULTAR SALDO ======");
        System.out.println("VALOR DO SALDO DESPONIVEL EM CONTA: " + saldo);
    }

    private void verificarEspecial(int valorSaque) {
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
