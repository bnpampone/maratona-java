package javacore.POO.HerancaPolimorfismo.Banco;

public class ContaEspecial extends ContaBancaria {
    private int limite;

    public int getLimite() {
        return limite;
    }

    @Override
    public boolean sacar(double num) {
        if((getSaldo() + limite - num) >= 0 ){
            this.setSaldo(this.getSaldo() - num);
            System.out.println("SAQUE ESPECIAL");
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                "; " + super.toString() +
                '}';
    }
}
