package academy.devdojo.devdojoacademy.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        System.out.println(file.getFileName());
        if (file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path dirInicial = Paths.get(".");
        Files.walkFileTree(dirInicial, new ListAllFiles());
    }
}
