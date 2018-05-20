package br.com.abc.javacore.Hheranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.getSalario());
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu, " + super.nome + " recebi o pagamento de R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
