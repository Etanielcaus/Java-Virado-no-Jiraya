package academy.devdojo.devdojoacademy.introducao;

public class Aula06ExtruturaDeRepeticao03 {
        public static void main(String[] args) {
            double valorTotal = 30000;
            for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
                double valorResultado = valorTotal / parcela;

                if (valorResultado < 1000){
                    continue;
                }

                System.out.println(valorResultado);
                System.out.println(parcela);
            }
        }

}
