package academy.devdojo.devdojoacademy.javacore.Vio.test;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Etaniel\\Desktop\\Desenvolvimento\\Java-Virado-no-Jiraya\\arquivo\\file.txt");

        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)){
//            Cria um pequeno Buffer de memória salvando o que contém em cada posição
//            char[] in = new char[5];
//            fileReader.read(in);
//            for (char c : in) {
//                System.out.println(c);
//            }

            String linha;
            while ((linha = bufferedReader.readLine()) != null){
                System.out.println(linha);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
