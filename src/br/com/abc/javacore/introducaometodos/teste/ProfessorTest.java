package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.setCpf("122.222.232-20");
        prof.setMatricula("11122");
        prof.setNome("Marcos");
        prof.setRg("122211-5");

        Professor prof2 = new Professor();
        prof2.setCpf("222.111.888-20");
        prof2.setMatricula("44444");
        prof2.setNome("Joana");
        prof2.setRg("2122-6");

        System.out.println("Professor1: " + prof + "\nProfessor2: " + prof2);

    }
}
