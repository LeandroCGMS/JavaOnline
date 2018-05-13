package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.init("Chica da Silva", "111.222.333-44", 4500,
                "122212-9");
        System.out.println(funcionario);


    }
}
