package javacore.POO.HerancaPolimorfismo.Animais;

public class Main {
    public static void main(String[] args) {
        Peixes tubarao = new Peixes();
        Mamifero camelo = new Mamifero();
        Mamifero urso = new Mamifero();

        tubarao.setNome("Tubarão Martelo");
        tubarao.setComprimento(200);
        tubarao.setVelocidade(1.5);

        camelo.setNome("Camelo");
        camelo.setComprimento(180);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(0.5);

        urso.setNome("Urso");
        urso.setComprimento(210);
        urso.setCor("Pardo");
        urso.setAmbiente("Terra");
        urso.setVelocidade(1.25);
        urso.setAlimento("Mel");

        Animal[] animais = new Animal[3];

        animais[0] = tubarao;
        animais[1] = camelo;
        animais[2] = urso;

        for(Animal animal : animais){
            System.out.println(animal);
        }
    }
}
