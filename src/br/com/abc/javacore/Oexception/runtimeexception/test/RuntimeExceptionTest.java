package br.com.abc.javacore.Oexception.runtimeexception.test;

import java.util.Scanner;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1=0, num2=0;
        System.out.println("Digite o número dividendo, seguido do número divisor pra obter o quociente.");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        try{
            divisao(num1, num2);
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            main(args);
        }


    }

    private static void divisao(int num1, int num2){
        if(num2 == 0){
            throw new IllegalArgumentException("Passe um número diferente de 0 para o num2.");
        }
        int resultado = num1/num2;
        System.out.println(resultado);
    }
}
