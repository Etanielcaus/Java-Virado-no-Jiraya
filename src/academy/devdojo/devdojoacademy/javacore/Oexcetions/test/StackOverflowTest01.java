package academy.devdojo.devdojoacademy.javacore.Oexcetions.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
    
}
