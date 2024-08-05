package academy.devdojo.devdojoacademy.javacore.Npolimorfismo.servico;

import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na Memória");
    }
}
