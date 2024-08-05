package academy.devdojo.devdojoacademy.javacore.Minterfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10; // Na interface, atributos já são static final e público
    void load();

    default void checkPermission() {
        System.out.println("Check Permission");
    }
    default void retrieveMaxDataSize(){ // default permite que eu acesse o método sem a necessidade de
        // sobrescrita do método.
        System.out.println("Dentro do MaxDataSize da interface");
    }
}
