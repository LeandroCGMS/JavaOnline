package br.com.abc.javacore.Eblocodeinicializacao.classes;

public class Cliente {
    // 1º - Alocado espaço na memória para o objeto que será criado
    // 2º - Cada atributo de classe é iniciado junto com seus valores default ou valores explícitos
    // 3º - Bloco de inicialização é executado
    // 4º - O construtor é executado
    private int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for(int i = 1; i <= 100; i++) {
            parcelas[i-1] = i;
        }
    }
    public Cliente() {

    }

    public int[] getParcelas() {
        return parcelas;
    }



    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
