package academy.devdojo.devdojoacademy.javacore.Oexcetions.runtime.test;

public class RuntimeException03 {
    public static void main(String[] args)  {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        }catch (Exception e){
            System.out.println("Fechando arquivo no catch");
            e.printStackTrace();
        } finally {
            System.out.println("Fechando arquivo no finally");
        }

    }

}
