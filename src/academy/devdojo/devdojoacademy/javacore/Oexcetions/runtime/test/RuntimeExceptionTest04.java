package academy.devdojo.devdojoacademy.javacore.Oexcetions.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        // Para tratar multiplas exceções, basta utilizar multiplos catchs
        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (FileNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws FileNotFoundException, SQLException {

    }
}
