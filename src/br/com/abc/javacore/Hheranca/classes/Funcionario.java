package br.com.abc.javacore.Hheranca.classes;

public class Funcionario extends Pessoa {
    private double salario;
    {
        System.out.println("Dentro do bloco de inicialização de funcionário 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionário 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionário");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

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
