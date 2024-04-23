package academy.devdojo.devdojoacademy.javacore.Oexcetions.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(6, 0));

    }
    private static int divisao(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal.");
        }
        return a/b;

//        try {
//            return a/b;
//        } catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//        return 0;
    }
}
