package br.com.abc.javacore.Gassociacao.classes.ExerDiagramaClasses;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private int idade;
    private Professor[] professores;
    private Seminario seminario;

    public Aluno(String nome, int idade, Professor[] professores, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.professores = professores;
        this.seminario = seminario;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade;
        if (this.professores != null && professores.length != 0) {
            s += ", professores=" + Arrays.toString(professores);
        }
        if (seminario != null) {
            s += ", seminario=" + seminario;
        }
        return s;
    }
}
