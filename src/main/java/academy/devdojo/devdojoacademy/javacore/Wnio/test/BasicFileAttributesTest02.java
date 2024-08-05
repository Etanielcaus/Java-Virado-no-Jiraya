package academy.devdojo.devdojoacademy.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) {
        Path path = Paths.get("pasta2/subpasta/test.txt");
        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
            FileTime creationTime = basicFileAttributes.creationTime();
            FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
            FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();

            System.out.println("creationTime: " + creationTime);
            System.out.println("lastAccessTime: " + lastAccessTime);
            System.out.println("lastModifiedTime: " + lastModifiedTime);
            System.out.println("===");

            BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
            FileTime fileTime = FileTime.fromMillis(Instant.now().toEpochMilli());
            creationTime = fileAttributeView.readAttributes().creationTime();
            fileAttributeView.setTimes(lastAccessTime, fileTime, creationTime);
            lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();
            lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();

            System.out.println("creationTime: " + creationTime);
            System.out.println("lastAccessTime: " + lastAccessTime);
            System.out.println("fileTime: " + fileTime);
            System.out.println("lastModifiedTime: " + lastModifiedTime);
            System.out.println("===");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
