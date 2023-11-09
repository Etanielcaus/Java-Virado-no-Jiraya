package academy.devdojo.devdojoacademy.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, int, short, double, long, float: 0
        // boolean: false
        // String: null

        int[] novoArray = new int[3];
        novoArray[0] = 20;
        novoArray[1] = 30;
        //novoArray[2] = 40;

        System.out.println(novoArray[0]);
        System.out.println(novoArray[1]);
        System.out.println(novoArray[2]);

        String[] arrayNomes = new String[2];
        arrayNomes[0] = "Nome 1";
        arrayNomes[1] = "Nome 2";

        System.out.println(arrayNomes[0]);
        System.out.println(arrayNomes[1]);
    }
}
