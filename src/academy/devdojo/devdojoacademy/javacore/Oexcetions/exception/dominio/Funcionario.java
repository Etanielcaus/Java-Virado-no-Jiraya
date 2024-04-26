package academy.devdojo.devdojoacademy.javacore.Oexcetions.exception.dominio;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, ArithmeticException{
        System.out.println("Salvando funcionario");
    }
}
