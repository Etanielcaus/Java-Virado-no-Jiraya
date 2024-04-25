package academy.devdojo.devdojoacademy.javacore.Oexcetions.runtime.test;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        // Para tratar multiplas exceções, basta utilizar multiplos catchs
        try {
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }
    }
}
