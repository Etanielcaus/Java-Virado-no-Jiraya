package academy.devdojo.devdojoacademy.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregandos Dados de base");
    }
}
