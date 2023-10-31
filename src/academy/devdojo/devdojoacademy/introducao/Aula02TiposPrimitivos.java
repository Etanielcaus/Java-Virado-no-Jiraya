package academy.devdojo.devdojoacademy.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, lang, boolean
        int idade = (int) 100000000000L; // forçar o Long caber no int
        long numeroGrande = 100000;
        double salarioDouble = (float) 2000.0D;
        float salarioFloat = 2500.0f;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "um graaaaaaande texto";
        // var nome2 = "Vegeta";
        String nome2 = "Vegeta";

        System.out.println(nome2);
        System.out.printf("Oi meu nome é " + nome);

        System.out.println();
        System.out.println("A idade é " + idade+" anos");
        System.out.println(caractere);
    }
}
