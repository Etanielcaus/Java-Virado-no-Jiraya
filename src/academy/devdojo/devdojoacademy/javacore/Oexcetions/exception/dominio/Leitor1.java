package academy.devdojo.devdojoacademy.javacore.Oexcetions.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Leitor 1 fechando");
    }
}
