package academy.devdojo.devdojoacademy.javacore.Oexcetions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file = new File("arquivo/teste1.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.printf("Arquivo criado" + isCriado);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
