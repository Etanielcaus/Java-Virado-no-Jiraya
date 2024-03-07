package academy.devdojo.devdojoacademy.javacore.Minterfaces.test;

import academy.devdojo.devdojoacademy.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.devdojoacademy.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.devdojoacademy.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        databaseLoader.load();
        databaseLoader.remove();
        System.out.println("=====");
        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();
        databaseLoader.checkPermission();
    }
}
