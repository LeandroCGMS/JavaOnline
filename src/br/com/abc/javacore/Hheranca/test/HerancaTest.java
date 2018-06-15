package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
//        Pessoa p = new Pessoa("Gina");
//        p.setCpf("12345");
        Endereco end = new Endereco();
//        end.setRua("Rua 25");
//        end.setBairro("Bairro 1");
//        p.setEndereco(end);
//        //p.imprime();
        System.out.println("-------------------------------------------");
        Funcionario f = new Funcionario("Augusto");
        f.setCpf("99765");
        f.setSalario(15000);
        f.setEndereco(end);
        //f.imprime();
    }
}
