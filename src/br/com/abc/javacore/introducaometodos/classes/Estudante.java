package br.com.abc.javacore.introducaometodos.classes;

import java.util.Scanner;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas = new double[3];
    Scanner scan = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Digite um valor acima de 0.");
            this.setIdade(scan.nextInt());
            return;
        }
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void imprimeDadosAluno() {
        System.out.println("Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nNotas: ");
        int i = 0;
        if (notas == null) {
            System.out.println("Aluno não possui notas.");
            return;
        }
        double somaNotas = 0;
        for (double n : notas) {
            somaNotas += n;
            i++;
            System.out.println(i + "ª nota: " + n);

        }
        double media = somaNotas / 3;
        System.out.println("A média do(a) " + this.getNome() + " é " + media + ", portanto");
        if (somaNotas / 3 >= 6) {
            System.out.print(this.getNome() + " está Aprovado.");
        } else {
            System.out.print(this.getNome() + " está Reprovado.");
        }
    }


}

