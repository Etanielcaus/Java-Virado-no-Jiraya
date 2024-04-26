package academy.devdojo.devdojoacademy.javacore.Oexcetions.exception.test;

import academy.devdojo.devdojoacademy.javacore.Oexcetions.exception.dominio.Funcionario;
import academy.devdojo.devdojoacademy.javacore.Oexcetions.exception.dominio.LoginInvalidoException;
import academy.devdojo.devdojoacademy.javacore.Oexcetions.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
