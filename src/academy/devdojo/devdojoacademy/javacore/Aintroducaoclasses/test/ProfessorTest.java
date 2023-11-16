package academy.devdojo.devdojoacademy.javacore.Aintroducaoclasses.test;

import academy.devdojo.devdojoacademy.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.nome = "Jonas";
        professor1.idade = 20;
        professor1.sexo = 'M';


        System.out.print(professor1.nome + " " + professor1.idade + " " + professor1.sexo);
    }
}
