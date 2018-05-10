package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

import java.util.Scanner;

public class EstudanteTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Estudante estudante = new Estudante();
        System.out.println("Entre com os dados do estudante.");
        System.out.println("Nome: ");
        estudante.setNome(scan.nextLine());
        System.out.println("Idade: ");
        estudante.setIdade(scan.nextInt());
        System.out.println("1ª nota: ");
        double[] notas = new double[3];
        notas[0] = scan.nextDouble();
        notas[1] = scan.nextDouble();
        notas[2] = scan.nextDouble();
        estudante.setNotas(notas);
        System.out.println("As informações entradas no sistema do estudante segue abaixo: ");
        estudante.imprimeDadosAluno();

    }
}
