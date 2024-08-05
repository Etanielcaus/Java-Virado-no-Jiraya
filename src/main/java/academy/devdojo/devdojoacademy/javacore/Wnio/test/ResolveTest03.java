package academy.devdojo.devdojoacademy.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("arquivo/home/Etaniel");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/arquivo/home");
        Path relativo = Paths.get("dev");
        System.out.println(absoluto.resolve(relativo));
    }
}
