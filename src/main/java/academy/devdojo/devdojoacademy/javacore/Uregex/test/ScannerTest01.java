package academy.devdojo.devdojoacademy.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Erin, Mikasa";
        String texto2 = "Levi, Erin, Mikasa, true, 200";

        // Delimitador usando o split, e o trim para tirar o ultimo espaço
        String[] splitTexto = texto.split(",");
        for (String nomes: splitTexto){
            System.out.println(nomes.trim());
        }
        System.out.println("===");


    }
}
