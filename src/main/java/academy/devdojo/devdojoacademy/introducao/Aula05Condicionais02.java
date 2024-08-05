package academy.devdojo.devdojoacademy.introducao;
import java.util.Scanner;

public class Aula05Condicionais02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 15){
            System.out.println("Categoria infantil");
        } else if (idade >= 15 && idade < 18){
            System.out.println("Categoria juvenil");
        } else {
            System.out.println("Categoria adulta");
        }

    }
}
