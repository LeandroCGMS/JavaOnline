package br.com.abc.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente) {
//        System.out.println("Gerando relatório de pagamento para a gerência");
//        gerente.calcularPagamento();
//        System.out.println("Salário desse mês: " + gerente.getNome() + "\nSalário: " + gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor) {
//        System.out.println("Gerando relatório de pagamento para os vendedores");
//        vendedor.calcularPagamento();
//        System.out.println("Salário desse mês: " + vendedor.getNome() + "\nSalário: " + vendedor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatório de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Salário desse mês: " + funcionario.getNome() + "\nSalário: " + funcionario.getSalario());
        if(funcionario instanceof Gerente){
            Gerente g = (Gerente) funcionario;
            System.out.println("Participação nos Lucros: " + g.getPnl());
        }
        if(funcionario instanceof Vendedor) {
            //Vendedor v = (Vendedor) funcionario;
            System.out.println("Total de vendas: " + ((Vendedor) funcionario).getTotalVendas());
        }
    }
}
