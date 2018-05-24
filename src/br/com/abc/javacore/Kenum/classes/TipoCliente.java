package br.com.abc.javacore.Kenum.classes;

public enum TipoCliente {
    // constant specific class body
    // corpo de classe específico constante
    PESSOA_FÍSICA(1, "Pessoa Física"), PESSOA_JURÍDICA(2, "Pessoa Jurífica"){
        public String getId() {
            return "B";
        }
    };

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public String getId() {
        return "A";
    }

    public String getNome() {
        return nome;
    }
}
