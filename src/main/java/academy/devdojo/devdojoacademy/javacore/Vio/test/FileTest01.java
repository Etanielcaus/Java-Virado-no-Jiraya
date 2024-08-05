package academy.devdojo.devdojoacademy.javacore.Vio.test;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Etaniel\\Desktop\\Desenvolvimento\\Java-Virado-no-Jiraya\\arquivo\\file.txt");

        try {

            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: "+isCreated);

            String filePath = file.getAbsolutePath();
            System.out.println(filePath);

            System.out.println("Nome: " + file.getName());
            System.out.println("É um diretório: " + file.isDirectory());
            System.out.println("É um arquivo: " + file.isFile());
            System.out.println("Esta escondido: " + file.isHidden());
            System.out.println("Pode ser lido: " + file.canRead());
            System.out.println("Ultima vez modificado: " + file.lastModified());
            System.out.println("Ultima vez modificado Set Data: " + new Date(file.lastModified()));

            boolean isExists = file.exists();
            if (isExists){
                boolean isDelete = file.delete();
                System.out.println("Deletado: " + isDelete);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
