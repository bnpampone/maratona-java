package academy.devdojo.maratonajava.javacore.Kenumeracoes.test;

import academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Kakaroto", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Goten", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente1 = TipoCliente.TipoClientePorNome("Pessoa Física");
        System.out.println(tipoCliente1);
    }
}
