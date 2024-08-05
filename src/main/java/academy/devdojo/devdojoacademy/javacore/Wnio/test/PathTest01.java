package academy.devdojo.devdojoacademy.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Etaniel\\Desktop\\Desenvolvimento\\Java-Virado-no-Jiraya\\arquivo\\file.txt");
        System.out.println(path.getFileName());

        Path path1 = Paths.get("C:","Users\\Etaniel\\Desktop\\Desenvolvimento\\Java-Virado-no-Jiraya\\arquivo","file.txt");
        Path path2 = Paths.get("C:","Users\\Etaniel\\Desktop\\Desenvolvimento","Java-Virado-no-Jiraya","arquivo");

//        Teste de curiosidade, isso está fora da aula atual.
//        try {
//            DirectoryStream<Path> paths = Files.newDirectoryStream(path2);
//
//            for (Path entry : paths){
//                System.out.println(entry.getFileName());
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }
}
