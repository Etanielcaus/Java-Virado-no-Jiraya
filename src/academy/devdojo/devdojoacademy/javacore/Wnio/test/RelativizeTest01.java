package academy.devdojo.devdojoacademy.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/arquivo/home/Etaniel");
        Path classe = Paths.get("/arquivo/home/Etaniel/dev/OlaMundo.java");

        Path pathToClasse = dir.relativize(classe);
        System.out.println(pathToClasse);
    }
}