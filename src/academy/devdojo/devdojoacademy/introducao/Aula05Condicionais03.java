package academy.devdojo.devdojoacademy.introducao;
import java.util.Scanner;

public class Aula05Condicionais03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu salario?");
        double salario = scanner.nextDouble();

        String mensagemPositiva = "Vou doar";
        String mensagemNegativa = "Não vou doar";

        //Operador ternário: variavel = (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemPositiva : mensagemNegativa;

        /*
        if (salario > 5000){
            resultado = mensagemPositiva;
        } else {
            resultado = mensagemNegativa;
        }
         */

        System.out.println(resultado);
    }
}
