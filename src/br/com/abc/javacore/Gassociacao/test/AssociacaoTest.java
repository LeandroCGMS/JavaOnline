package br.com.abc.javacore.Gassociacao.test;

import br.com.abc.javacore.Gassociacao.classes.ExerDiagramaClasses.Aluno;
import br.com.abc.javacore.Gassociacao.classes.ExerDiagramaClasses.Local;
import br.com.abc.javacore.Gassociacao.classes.ExerDiagramaClasses.Professor;
import br.com.abc.javacore.Gassociacao.classes.ExerDiagramaClasses.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("William Suane", 27);

        Seminario seminario = new Seminario("Como Ser Um Baita Programador");

        Professor prof = new Professor("Yoda","Usar a força para progamar");
        //aluno.setProfessores(new Professor[]{prof});
        Local local = new Local("Rua das Araras", "Mato");

        seminario.setLocal(local);
        seminario.setProfessor(prof);
        aluno.setSeminario(seminario);

        System.out.println(aluno);
    }
}
