package academy.devdojo.devdojoacademy.javacore.Aintroducaoclasses.test;

import academy.devdojo.devdojoacademy.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 18;
        estudante.nome = "Luffy";
        estudante.sexo = 'M';
        System.out.println(estudante.idade);
    }
}
