package academy.devdojo.devdojoacademy.javacore.test;

import academy.devdojo.devdojoacademy.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest06 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 5, 3, 7};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,6,7,6);
        calculadora.mostrarNomesVarArgs("Goku", "Vegeta", "Naruto", "Sakura", "Qualquer");
    }
}
