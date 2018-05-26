package br.com.abc.javacore.Lclassesabstratas.test;

import br.com.abc.javacore.Lclassesabstratas.classes.Funcionario;
import br.com.abc.javacore.Lclassesabstratas.classes.Gerente;
import br.com.abc.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Camila", "22211-4", 3000, 5000);
        Gerente g = new Gerente("Anna", "11122-2", 2000);
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(v);
        System.out.println("--------------------------------------------------------------");
        System.out.println(g);
    }
}
