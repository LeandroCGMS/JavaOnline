package br.com.abc.javacore.Gassociacao.classes.ExerDiagramaClasses;

import java.util.Arrays;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    private Aluno[] alunos;

    public Professor(String nome, String especialidade, Seminario[] seminarios, Aluno[] alunos) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
        this.alunos = alunos;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Professor{" +
                "nome='" + nome + '\'' +
                ", especialidade='" + especialidade;

        if(this.seminarios != null && seminarios.length != 0){
            s += ", seminarios=" + Arrays.toString(seminarios);
        }
        if(this.alunos != null && alunos.length != 0){
            s += ", alunos=" + Arrays.toString(alunos);
        }
        return s;
    }
}
