package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(55.5,5);
        System.out.println("Divisão de dois números: " + calc.divideDoisNumeros(20,0));
        calc.imprimeDoisNumerosDivididos(20,0);

        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5  );
        System.out.println("Continuando a execução.");
    }
}
