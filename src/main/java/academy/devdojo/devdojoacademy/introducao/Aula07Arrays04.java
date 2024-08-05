package academy.devdojo.devdojoacademy.introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        int[] numeros2 = {10, 20, 30};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        int[] numeros3 = new int[]{10, 20, 30};
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }
        System.out.println("             ");


        for(int i:numeros3){
            System.out.println(i);
        }

        String[] nomes = {"Vegeta", "Goku", "Picollo"};
        for (String i:nomes){
            System.out.println(i);
        }
    }
}
