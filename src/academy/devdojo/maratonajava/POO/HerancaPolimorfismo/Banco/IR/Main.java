package javacore.POO.HerancaPolimorfismo.Banco.IR;

public class Main {
    public static void main(String[] args) {
        PJuridica pessoa1 = new PJuridica();
        PJuridica pessoa2 = new PJuridica();
        PJuridica pessoa3 = new PJuridica();

        pessoa1.setNome("Breno Pamponé");
        pessoa1.setRendaBruta(5000);

        pessoa2.setNome("Neymar Junior");
        pessoa2.setRendaBruta(10000);

        pessoa3.setNome("Cristiano Ronaldo");
        pessoa3.setRendaBruta(2500);


        PFisica pessoa4 = new PFisica();
        PFisica pessoa5 = new PFisica();
        PFisica pessoa6 = new PFisica();

        pessoa4.setNome("Bortoledo Senna");
        pessoa4.setRendaBruta(1250);

        pessoa5.setNome("Ayrton Junior");
        pessoa5.setRendaBruta(3000);

        pessoa6.setNome("Lionel Messi");
        pessoa6.setRendaBruta(10000);

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = pessoa1;
        contribuintes[1] = pessoa2;
        contribuintes[2] = pessoa3;
        contribuintes[3] = pessoa4;
        contribuintes[4] = pessoa5;
        contribuintes[5] = pessoa6;


        for(Contribuinte c : contribuintes){
            System.out.println(c);
        }
    }

}
