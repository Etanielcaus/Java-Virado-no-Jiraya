package academy.devdojo.devdojoacademy.javacore.Oexcetions.runtime.test;

public class RuntimeException03 {
    public static void main(String[] args)  {
        abreConexao();
        abreConexao2();

    }

    private static String abreConexao(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }catch (Exception e){
            System.out.println("Fechando arquivo no catch");
            e.printStackTrace();
        } finally {
            System.out.println("Fechando arquivo no finally");
        }
        return null;
    }

    private static void abreConexao2(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        }finally {
            System.out.println("Fechando arquivo no finally");
        }
    }

}
