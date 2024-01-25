package academy.devdojo.devdojoacademy.javacore.Kenum.test;

public class ClienteTest {
    // ================================================
    public enum DiaDaSemana{ // Teste fora da aula
        SEGUNDA, TERÇA, QUARTA
    }
    // ================================================
    public static void main(String[] args) {

        // ================================================
        // Teste fora da aula
        DiaDaSemana diaSegunda = DiaDaSemana.SEGUNDA;
        DiaDaSemana diaTerça = DiaDaSemana.TERÇA;

        if (diaSegunda != diaTerça){
            System.out.println("Dia igual");
        }
        System.out.println("Dia diferente");
        // ================================================

    }
}
