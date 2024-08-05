package academy.devdojo.devdojoacademy.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        int[][] dias = new int[2][2];
        dias[0][0]= 10;
        dias[0][1]= 20;

        dias[1][0]= 10;
        dias[1][1]= 20;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[j][i]);
            }
        }

        String[][] nomes = new String[2][2];
        nomes[0][0] = "Goku";
        nomes[0][1] = "Vegeta";

        nomes[1][0] = "Picollo";
        nomes[1][1] = "Naruto";

        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < nomes[0].length; j++) {
                System.out.println(nomes[j][i]);
            }
        }

    }
}
