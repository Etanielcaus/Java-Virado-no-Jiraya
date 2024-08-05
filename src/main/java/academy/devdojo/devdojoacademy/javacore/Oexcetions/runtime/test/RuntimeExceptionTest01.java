package academy.devdojo.devdojoacademy.javacore.Oexcetions.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // CHECKED and UNCHECKED
        // RuntimeException é unchecked, ou seja ela não precisa ser tratada obrigatóriamente.
        Object object = null;
        System.out.print(object.toString());
    }
}
