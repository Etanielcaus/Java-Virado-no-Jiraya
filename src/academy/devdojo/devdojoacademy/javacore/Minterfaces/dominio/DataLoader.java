package academy.devdojo.devdojoacademy.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();

    default void checkPermission() {
        System.out.println("Check Permission");
    }
}
