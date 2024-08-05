package academy.devdojo.devdojoacademy.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("C:\\Users\\Etaniel\\Desktop\\Desenvolvimento\\Java-Virado-no-Jiraya\\arquivo\\folder");
        boolean isDiretorio = fileDiretorio.mkdir();
        System.out.println(isDiretorio);


        File arquivoDiretorio = new File(fileDiretorio, "archive.txt");
        try {
            arquivoDiretorio.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File fileRename = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = arquivoDiretorio.renameTo(fileRename);
        System.out.println(isRenamed);

//        File arquivoDiretorio = new File("C:\\Users\\Etaniel\\Desktop\\Desenvolvimento\\Java-Virado-no-Jiraya\\arquivo\\folder\\archive.txt");
//        try {
//            boolean newFile = arquivoDiretorio.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
