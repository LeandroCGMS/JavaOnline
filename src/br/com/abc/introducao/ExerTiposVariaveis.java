package br.com.abc.introducao;

import java.util.Scanner;

public class ExerTiposVariaveis {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nome;
        String endereco;
        long telefone = 0;

        System.out.println("Qual o nome do cliente?");
        nome = scan.nextLine();
        System.out.println("Qual o endereço dele?");
        endereco = scan.nextLine();
        String resposta = "";
        boolean entradaValida = false;
        while(!entradaValida){
            try{
                System.out.println("Qual o telefone dele? (somente números, com 8 ou 9 dígitos)");
                resposta = scan.nextLine();
                telefone = Long.parseLong(resposta);
                if(telefone >= 11111111 && telefone <= 999999999 ){
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch(Exception e){
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }

        System.out.println("O " + nome + " situado no endereço " + endereco + " e telefone " + telefone + "" +
                " não possui nenhum tipo de pendência.");



    }
}
