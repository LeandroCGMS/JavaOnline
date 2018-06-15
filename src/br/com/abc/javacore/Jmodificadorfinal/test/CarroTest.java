package br.com.abc.javacore.Jmodificadorfinal.test;

import br.com.abc.javacore.Jmodificadorfinal.classes.Carro;
import br.com.abc.javacore.Jmodificadorfinal.classes.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(Carro.VELOCIDADE_FINAL);
        System.out.println(c.getComprador());
        c.getComprador().setNome("Kuririn");
        System.out.println(c.getComprador());


    }
}
