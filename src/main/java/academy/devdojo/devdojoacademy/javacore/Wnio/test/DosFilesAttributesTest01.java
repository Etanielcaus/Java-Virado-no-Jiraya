package academy.devdojo.devdojoacademy.javacore.Wnio.test;

import javax.xml.xpath.XPath;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFilesAttributesTest01 {
    public static void main(String[] args) {
        Path pathArquivotxt = Paths.get("pasta2/arquivo.txt");

        try {
            if (Files.notExists(pathArquivotxt)) Files.createFile(pathArquivotxt);

            Files.setAttribute(pathArquivotxt, "dos:hidden", false);
            Files.setAttribute(pathArquivotxt, "dos:readonly", false);

            DosFileAttributes dosFileAttributes = Files.readAttributes(pathArquivotxt, DosFileAttributes.class);
            System.out.println(dosFileAttributes.isHidden());
            System.out.println(dosFileAttributes.isReadOnly());

            DosFileAttributeView fileAttributeView = Files.getFileAttributeView(pathArquivotxt, DosFileAttributeView.class);
            fileAttributeView.setHidden(true);
            fileAttributeView.setReadOnly(true);
            System.out.println(fileAttributeView.readAttributes().isReadOnly());
            System.out.println(fileAttributeView.readAttributes().isHidden());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
