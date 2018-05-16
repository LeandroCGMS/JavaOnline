package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Cliente {
    // 1º - Bloco de inicialização estático é executado quando a JVM executar a classe (é executado apenas uma vez)
    // 2º - Alocado espaço na memória para o objeto que será criado
    // 3º - Cada atributo de classe é iniciado junto com seus valores default ou valores explícitos
    // 4º - Bloco de inicialização é executado
    // 5º - O construtor é executado
    private static int[] parcelas;

    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização estático");
        for(int i = 1; i <= 100; i++) {
            parcelas[i-1] = i;
        }
    }


    public Cliente() {

    }

    public static int[] getParcelas() {
        return parcelas;
    }

}
