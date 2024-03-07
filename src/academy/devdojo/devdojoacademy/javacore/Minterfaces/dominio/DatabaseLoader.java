package academy.devdojo.devdojoacademy.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregandos Dados de base");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados.");
    }
}
