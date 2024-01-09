package academy.devdojo.devdojoacademy.javacore.Hherança.test;

import academy.devdojo.devdojoacademy.javacore.Hherança.domain.Pessoa;

public class Funcionario2 extends Pessoa {
    public void imprime (){
        // tem acesso a variavel protected, pois ele herda de Pessoa
        this.nome = "Pedro";
    }
}
