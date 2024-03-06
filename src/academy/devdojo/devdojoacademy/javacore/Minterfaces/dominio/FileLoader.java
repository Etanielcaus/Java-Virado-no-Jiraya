package academy.devdojo.devdojoacademy.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregando arquivos");
    }
}
