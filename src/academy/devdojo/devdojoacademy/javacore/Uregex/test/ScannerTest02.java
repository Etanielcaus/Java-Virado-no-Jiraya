package academy.devdojo.devdojoacademy.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi, Erin, Mikasa, true, 200";
        Scanner scanner = new Scanner(texto);

        scanner.useDelimiter(", ");
//        System.out.println(scannerTexto);

        while (scanner.hasNext()){
//            System.out.println(scannerTexto.next());

            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("int: " +i);
            } else if (scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolan: " + b);
            }else {
                System.out.println(scanner.next());
            }
        }


    }
}
