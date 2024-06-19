package academy.devdojo.devdojoacademy.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) throws IOException {
        Path arquivoZip = Paths.get("pasta2/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta2/subpasta");
        zip(arquivoZip, arquivosParaZipar);
    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar) throws IOException {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip))) {
            Files.walk(arquivosParaZipar)
                    .filter(path -> !Files.isDirectory(path))
                    .forEach(path -> {
                        ZipEntry zipEntry = new ZipEntry(arquivosParaZipar.relativize(path).toString());
                        try {
                            zipStream.putNextEntry(zipEntry);
                            Files.copy(path, zipStream);
                            zipStream.closeEntry();
                            System.out.println("File: " + path.getFileName().toString());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        }
    }
}
