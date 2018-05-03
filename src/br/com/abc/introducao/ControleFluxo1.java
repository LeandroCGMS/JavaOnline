package br.com.abc.introducao;

public class ControleFluxo1 {
    public static void main(String[] args) {
        int idade = 18;
        float salario = 2000;
        boolean c = false;
        String categoria;
        if(idade < 15){
            categoria = "Categoria infantil.";
        } else if(idade >= 15 && idade < 18){
            categoria = "Categoria juvenil.";
        } else {
            categoria = "Categoria adulta.";
        }
        System.out.println(categoria);
    }
}
