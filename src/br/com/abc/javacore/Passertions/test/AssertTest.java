package br.com.abc.javacore.Passertions.test;

public class AssertTest {
    public static void main(String[] args) {
        diasDaSemana(9);
    }

    private static void calculaSalario(double salario) {
        assert (salario > 0) : "O salário não pode ser menor do que zero. O salário veio como: R$" + salario;
        //fazer cálculo com salário
    }

    public static void diasDaSemana(int dias) {
        switch (dias) {
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default: assert false;
        }
    }
}
