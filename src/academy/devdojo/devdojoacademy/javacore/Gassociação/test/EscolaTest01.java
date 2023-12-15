package academy.devdojo.devdojoacademy.javacore.Gassociação.test;

import academy.devdojo.devdojoacademy.javacore.Gassociação.domain.Escola;
import academy.devdojo.devdojoacademy.javacore.Gassociação.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Escola escola = new Escola("Social Education");
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Pedro", "Física");
        Professor professor4 = new Professor("Luiz", "Artes");

        escola.addProfessor(professor4);
        escola.addProfessor(professor1);
        escola.addProfessor(professor2);
        escola.imprimeList();

        System.out.println("====");

        Professor professor3 = new Professor("Antonio", "Artes");
        Professor[] professors2 = {professor1, professor2, professor3};
        Escola escola2 = new Escola("Other school", professors2);
        escola2.imprime();
    }
}
