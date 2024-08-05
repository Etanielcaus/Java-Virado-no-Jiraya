package academy.devdojo.devdojoacademy.javacore.Oexcetions.exception.test;

import academy.devdojo.devdojoacademy.javacore.Oexcetions.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);

        String usernameDB = "Joao";
        String senhaDB = "123";

        System.out.println("Username: ");
        String usernameIn = scanner.nextLine();

        System.out.println("password: ");
        String passwordIn = scanner.nextLine();

        if (!usernameIn.equals(usernameDB) || !passwordIn.equals(senhaDB)){
            throw new LoginInvalidoException("Usuário ou senha inválido.");
        }

        System.out.println("Usuário logado com sucesso.");
    }
}
