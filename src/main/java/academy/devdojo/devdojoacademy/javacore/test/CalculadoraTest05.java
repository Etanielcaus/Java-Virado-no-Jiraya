package academy.devdojo.devdojoacademy.javacore.test;

import academy.devdojo.devdojoacademy.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 2;
        int num2 = 20;

        calculadora.alteraDoisNumeros(num1, num2);

        System.out.println("----------");
        System.out.println(num1);
        System.out.println(num2);
    }
}
