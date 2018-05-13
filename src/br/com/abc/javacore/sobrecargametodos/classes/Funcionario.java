package br.com.abc.javacore.sobrecargametodos.classes;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;
    private Scanner scan = new Scanner(System.in);

    public Funcionario(String nome, String cpf, double salario, String rg) {
        //pequeno exemplo de validação no método construtor
        if(nome.length() < 3){
            System.out.println("Nome não pode ter menos que 3 caracteres. Tente novamente.");
            new Funcionario(scan.nextLine(), cpf, salario, rg);
        } else {
            this.nome = nome;

        }
    }

    public Funcionario() {

    }

    public void init(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void init(String nome, String cpf, double salario, String rg) {
        this.init(nome, cpf, salario);
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nSalário: " + this.salario + "\nRG: " + this.rg;
    }
}
