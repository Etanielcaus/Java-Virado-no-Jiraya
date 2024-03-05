package academy.devdojo.devdojoacademy.javacore.Lclassesabastratas.test;

import academy.devdojo.devdojoacademy.javacore.Lclassesabastratas.dominio.Desenvolvedor;
import academy.devdojo.devdojoacademy.javacore.Lclassesabastratas.dominio.Funcionario;
import academy.devdojo.devdojoacademy.javacore.Lclassesabastratas.dominio.Gerente;

public class TestFuncionario {
    public static void main(String[] args) {
        // Funcionário é abstrato agora
       // Funcionario funcionario01 = new Funcionario("João", 158);
        Gerente gerente01 = new Gerente("Pedro", 5000);
        Desenvolvedor desenvolvedor01 = new Desenvolvedor("João", 1200);

        System.out.println(desenvolvedor01);
        System.out.println(gerente01);
    }
}
