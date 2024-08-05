package academy.devdojo.devdojoacademy.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    public int tamanho;

    public FileLoader(int tamanho) {
        this.tamanho = tamanho;
    }

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

    @Override
    public void retrieveMaxDataSize() {
        DataLoader.super.retrieveMaxDataSize();
        int resultado = tamanho + MAX_DATA_SIZE;
        System.out.println("O tamanho do arquivo é: " + resultado);
    }
}
