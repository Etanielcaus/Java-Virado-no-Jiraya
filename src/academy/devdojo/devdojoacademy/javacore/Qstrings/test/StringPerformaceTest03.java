package academy.devdojo.devdojoacademy.javacore.Qstrings.test;

public class StringPerformaceTest03 {
    public static void main(String[] args) {
        long incio = System.currentTimeMillis();
        concatString(10000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - incio) + " ms - String Normal");

        System.out.println("--------------");

        incio = System.currentTimeMillis();
        concatStringBuilder(10000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - incio) + " ms - StringBuilder");

        System.out.println("--------------");

        incio = System.currentTimeMillis();
        concatStringBuffer(10000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - incio) + " ms - StringBuffer");
    }
    
    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto +=i; // 0,01,0123...
//            System.out.println(i);
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
//            System.out.println(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
//            System.out.println(i);
        }
    }
}
