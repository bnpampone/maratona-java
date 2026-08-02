package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public void calcBonus(){
        this.salario = this.salario + this.salario * 0.05;
    }

}
