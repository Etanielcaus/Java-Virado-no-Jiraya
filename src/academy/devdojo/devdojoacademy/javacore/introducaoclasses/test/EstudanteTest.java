package academy.devdojo.devdojoacademy.javacore.introducaoclasses.test;

import academy.devdojo.devdojoacademy.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 18;
        estudante.nome = "Luffy";
        estudante.sexo = 'M';
        System.out.println(estudante.idade);
    }
}
