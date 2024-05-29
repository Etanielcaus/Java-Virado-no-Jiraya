package academy.devdojo.devdojoacademy.javacore.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Etaniel\\Desktop\\Desenvolvimento\\Java-Virado-no-Jiraya\\arquivo\\file.txt");

        try(FileReader fileReader = new FileReader(file)){
//            Cria um pequeno Buffer de memória salvando o que contém em cada posição
//            char[] in = new char[5];
//            fileReader.read(in);
//            for (char c : in) {
//                System.out.println(c);
//            }

            int i;
            while ((i=fileReader.read()) != -1){
                System.out.print((char)i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
