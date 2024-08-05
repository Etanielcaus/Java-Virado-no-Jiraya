package academy.devdojo.devdojoacademy.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        String[][] nomes = new String[2][2];
        nomes[0][0] = "Goku";
        nomes[0][1] = "Vegeta";

        nomes[1][0] = "Picollo";
        nomes[1][1] = "Naruto";

        for (String[] arrBase: nomes) {
            for (String arrDentro: arrBase){
                System.out.println(arrDentro);
            }
        }
    }
}
