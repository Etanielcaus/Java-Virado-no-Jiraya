package academy.devdojo.devdojoacademy.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Etaniel\\Desktop\\Desenvolvimento\\Java-Virado-no-Jiraya\\arquivo\\file.txt");
//        Ao utilizar como recurso dentro do Try, ele faz o fileWriter.close() automaticamente.
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bf = new BufferedWriter(fileWriter)){

            bf.write("Test File.");
            bf.newLine();
            bf.flush(); // Para garantir que algo está sendo escrito dentro do arquivo

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
