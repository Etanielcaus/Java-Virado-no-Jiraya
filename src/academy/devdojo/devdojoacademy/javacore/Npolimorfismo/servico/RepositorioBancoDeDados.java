package academy.devdojo.devdojoacademy.javacore.Npolimorfismo.servico;

import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
