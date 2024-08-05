package academy.devdojo.devdojoacademy.javacore.Aintroducaoclasses.test;

import academy.devdojo.devdojoacademy.javacore.Aintroducaoclasses.dominio.Professor;

public class CadastrandoProfessor {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.nome = "Proff";
        professor1.sexo = 'M';
        professor1.idade = 16;

        professor1.checarsemaior();
    }
}
