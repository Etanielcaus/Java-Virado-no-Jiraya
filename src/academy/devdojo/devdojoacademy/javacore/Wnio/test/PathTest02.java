package academy.devdojo.devdojoacademy.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;

public class PathTest02 {
    public static void main(String[] args) {
        try {
            Path pathPrincipal = Paths.get("pasta2");
            Path subPaths = Paths.get("pasta2\\subpasta");
            Path filePath = Paths.get(subPaths.toString(), "file.txt");

//            Cria uma pasta
            if (Files.notExists(pathPrincipal)){
                Path pathPrincipal1 = Files.createDirectory(pathPrincipal);
                System.out.println("Path já existe.");

            }

//            Cria várias pastas
            Path subPaths1 = Files.createDirectories(subPaths);

//            Criar um arquivo
            if (Files.notExists(filePath)){
                Path filePathCreated = Files.createFile(filePath);
                System.out.println("Arquivo criado");
            }

//            Copiar um arquivo
            Path source = filePath;
            Path target = Paths.get(filePath.getParent().toString(), "filerenamed.txt");
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
