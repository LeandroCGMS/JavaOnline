package br.com.abc.introducao;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        /*
         * Crie uma variável salário e imprima seu imposto
         * imposto:
         * salário < 1000 5%
         * salário >= 1000 && salário < que 2000 10%
         * salário >= 2000 && salário < 4000 15%
         * salário > 5000 20%
         * */

        double salario = 5001;
        if(salario < 1000){
            System.out.println("Salário de " + salario + ", Imposto de 5%: " + salario * 0.05);
        } else if(salario >= 1000 && salario < 2000) {
            System.out.println("Salário de " + salario + ", Imposto de 10%: " + salario * 0.10);
        } else if(salario >= 2000 && salario < 4000){
            System.out.println("Salário de " + salario + ", Imposto de 15%: " + salario * 0.15);
        } else if (salario > 5000){
            System.out.println("Salário de " + salario + ", Imposto de 20%: " + salario * 0.20);//ok
        }
    }
}
