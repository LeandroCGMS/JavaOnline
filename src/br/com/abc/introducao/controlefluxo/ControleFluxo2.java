package br.com.abc.introducao.controlefluxo;

public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 14;
        String status;

        status = idade < 15 ? "Infantil" : idade >= 15 && idade < 18 ? "juvenil" : "adulto";

        System.out.println(status);
    }
}
