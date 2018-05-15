package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Carro {
    // Velocidade limite deve ser 240km/h
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 240;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("---------------------------");
        System.out.println("Nome             : " + nome +
                "\nVelocidade Máxima: " +
                velocidadeMaxima + "\nVelocidade Limite: "
        + velocidadeLimite);
    }

}
