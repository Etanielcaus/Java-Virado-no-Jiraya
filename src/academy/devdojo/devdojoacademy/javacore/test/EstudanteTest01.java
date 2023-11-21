package academy.devdojo.devdojoacademy.javacore.test;

import academy.devdojo.devdojoacademy.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.devdojoacademy.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante imprimirEstudante = new ImpressoraEstudante();

        estudante01.nome = "Zoro";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Alicia";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        imprimirEstudante.imprimirEstudante(estudante01);
        imprimirEstudante.imprimirEstudante(estudante02);
    }
}
