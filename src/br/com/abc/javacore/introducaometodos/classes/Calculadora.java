package br.com.abc.javacore.introducaometodos.classes;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumeros(double num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        System.out.println("Não pode dividir um número por zero.");
        return 0;
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println("Imprimindo dois números divididos: " + num1 + " dividido por " + num2 + " = " +
                    (num1 / num2));
            return;
        }
        System.out.println("Não pode dividir um número por zero.");

    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do método Altera Dois Números");
        System.out.println("num1: " + num1 + "\nnum2: " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int ... numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
