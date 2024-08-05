package academy.devdojo.devdojoacademy.introducao;
import java.util.Scanner;
public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        double resultado = numero1 + numero2; // a divisão de dois inteiros sempre resultara em um inteiro

        System.out.println(resultado);

        // %
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("impar");
        }

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte"+isDezMaiorQueVinte);

        // && and
        // || or

        double bonus = 1000;
        bonus += 1800;
        System.out.println(bonus);
    }
}
