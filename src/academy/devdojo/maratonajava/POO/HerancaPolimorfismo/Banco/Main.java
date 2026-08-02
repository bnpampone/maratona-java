package javacore.POO.HerancaPolimorfismo.Banco;

public class Main {
    static void main(String[] args) {

        System.out.println("======Conta Bancaria=======");
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNomeCliente("Breno");
        contaBancaria.setNumConta(111);
        contaBancaria.setSaldo(100);
        realizarSaque(contaBancaria, 50);
        realizarSaque(contaBancaria, 70);
        contaBancaria.depositar(25);
        System.out.println(contaBancaria);


        System.out.println("======Conta Poupança=======");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Neymar");
        contaPoupanca.setNumConta(222);
        contaPoupanca.setSaldo(100);
        contaPoupanca.setDiaRendimento(5);
        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);
        contaPoupanca.depositar(25);

        if(contaPoupanca.calcularNovoSaldo(5, 5)){
            System.out.println("Rendimento aplicado, novo saldo é de " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é o dia de rendimento como um bonûs!");
        }
        System.out.println(contaPoupanca);



        System.out.println("======Conta Especial=======");
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Ancelloti");
        contaEspecial.setNumConta(333);
        contaEspecial.setSaldo(100);
        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        contaEspecial.depositar(25);
        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaBancaria conta, double valor){
        if(conta.sacar(valor)){
            System.out.println("Saque realizado com sucesso, saldo atual de " + conta.getSaldo());
        } else {
            System.out.println("Saque insuficiente para saque de " + valor + ". Saldo de " + conta.getSaldo());
        }
    }
}
