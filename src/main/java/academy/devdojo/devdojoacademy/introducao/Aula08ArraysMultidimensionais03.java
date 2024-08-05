package academy.devdojo.devdojoacademy.introducao;

public class Aula08ArraysMultidimensionais03 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[2][];
        arrayInt[0] = new int[2];
        arrayInt[0][1] = 20;

        arrayInt[1] = new int[4]; // itera sobre todas as posições
        arrayInt[1][3] = 50;

        int[][] arrayDePosicao2 = {{2, 3}, {4, 5}, {6, 7}};

        for (int[] inteiros : arrayDePosicao2) {
            System.out.println(inteiros);
            for (int dentroDoArray2 : inteiros) {
                System.out.print(dentroDoArray2);
                System.out.println("\n-----");
            }
        }

        for (int[] i : arrayInt) {
            System.out.println("\n----");
            System.out.println("Array: " + i + ", Endereço de Memória: " + System.identityHashCode(i));
            for (int adentro : i) {
                System.out.print(" " + adentro);
            }
        }
    }
}
