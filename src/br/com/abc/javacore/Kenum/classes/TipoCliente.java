package br.com.abc.javacore.Kenum.classes;

public enum TipoCliente {
    PESSOA_FÍSICA(1, "Pessoa Física"), PESSOA_JURÍDICA(2, "Pessoa Jurífica");

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
