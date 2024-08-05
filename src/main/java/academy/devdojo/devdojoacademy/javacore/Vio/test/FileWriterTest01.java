package academy.devdojo.devdojoacademy.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Etaniel\\Desktop\\Desenvolvimento\\Java-Virado-no-Jiraya\\arquivo\\file.txt");
//        Ao utilizar como recurso dentro do Try, ele faz o fileWriter.close() automaticamente.
        try (FileWriter fileWriter = new FileWriter(file, true)){
            fileWriter.write("Test File.");
            fileWriter.flush(); // Para garantir que algo está sendo escrito dentro do arquivo
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
