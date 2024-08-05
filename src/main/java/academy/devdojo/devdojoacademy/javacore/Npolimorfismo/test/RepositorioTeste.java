package academy.devdojo.devdojoacademy.javacore.Npolimorfismo.test;

import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
