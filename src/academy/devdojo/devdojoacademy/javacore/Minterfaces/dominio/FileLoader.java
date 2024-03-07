package academy.devdojo.devdojoacademy.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando arquivos");
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivo do banco de dados");
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
        System.out.println("Checando permissões");
    }
}
