package br.com.abc.javacore.Gassociacao.classes.ExerDiagramaClasses;

import java.util.Arrays;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;
    private Professor professor;

    public Seminario(String titulo, Local local, Aluno[] alunos, Professor professor) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
        this.professor = professor;
    }

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Seminario{" +
                "titulo='" + titulo + '\'' +
                ", local=" + local +
                ", alunos=" + Arrays.toString(alunos) +
                ", professor=" + professor +
                '}';
    }
}
