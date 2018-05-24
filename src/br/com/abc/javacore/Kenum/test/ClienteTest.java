package br.com.abc.javacore.Kenum.test;

import br.com.abc.javacore.Kenum.classes.Cliente;
import br.com.abc.javacore.Kenum.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Anna",TipoCliente.PESSOA_FÍSICA, Cliente.TipoPagamento.AVISTA);
        System.out.println(TipoCliente.PESSOA_JURÍDICA.getId());
        System.out.println(TipoCliente.PESSOA_FÍSICA.getId());
        System.out.println(cliente);
    }
}
