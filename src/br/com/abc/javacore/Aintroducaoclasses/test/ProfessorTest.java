package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

import java.util.Scanner;

public class ProfessorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Professor prof = new Professor();
        System.out.println("\t\tDados do Professor");
        System.out.println("Nome: ");
        prof.setNome(scan.nextLine());
        System.out.println("Matrícula: ");
        prof.setMatricula(scan.nextLine());
        System.out.println("RG: ");
        prof.setRg(scan.nextLong());
        System.out.println("CPF:");
        prof.setCpf(scan.nextLong());

        System.out.println("Segue os dados do professor\n" + prof);

    }
}
