package academy.devdojo.devdojoacademy.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAtrributesTest01 {
    public static void main(String[] args) {
        // DosFileAttributos => DOS
        // PosixFileAttributes => Sistemas Unix
//        BasicFileAttributes

        File file = new File("C:\\Users\\Etaniel\\Desktop\\Desenvolvimento\\Java-Virado-no-Jiraya\\pasta2\\test.txt");
        LocalDateTime dezDias = LocalDateTime.now().minusDays(10);
        try {
            file.createNewFile();
            file.setLastModified(dezDias.toInstant(ZoneOffset.UTC).toEpochMilli());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Path path = Paths.get("pasta2/subpasta/test.txt");
        try {
            if (Files.notExists(path)) {
                Files.createFile(path);
                FileTime fileTime = FileTime.from(dezDias.toInstant(ZoneOffset.UTC));
                Files.setLastModifiedTime(path, fileTime);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
    }
}
