package academy.devdojo.devdojoacademy.introducao;
import java.util.Scanner;

public class Aula05Condicionais04 {
    public static void main(String[] args) {
        //Imprima os dias da semana onde dia 1 é domingo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para o dia da semana: ");
        byte dia = scanner.nextByte();
        System.out.println("Sexo: M ou F");
        String sexo = scanner.next();
        // (Char, int, byte, short, enum, String)
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

        switch (sexo){
            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Digite uma opção valida");
        }
    }
}
