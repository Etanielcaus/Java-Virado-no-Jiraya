package academy.devdojo.devdojoacademy.introducao;

public class Aula06ExtruturaDeRepeticao02 {
    // Imprima os primeiros 25 números;
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i < valorMax; i++) {
            System.out.println(i);
            if (i >= 25){
                // System.out.println(i);
                break;
            }
        }
    }
}
