package academy.devdojo.devdojoacademy.javacore.Qstrings.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String nome2 = " Luffy   ";
        String numeros = "012345";

        // posição dos caracteres
        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(1));

        // Tamanho da String
        System.out.println(nome.length());
        System.out.println(numeros.length());

        // Trocar todos os caracteres da posição
        System.out.println(nome.replace("f", "l")); // Luffy = Lully
        System.out.println(nome2.replace(" ", "*"));

        // Modificar o case dos caracteres
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        // Substrings, mostra do primeiro indice até o proximo
        System.out.println(numeros.substring(0, 2));
        System.out.println(numeros.substring(3));

        // Remove os valores em branco que tem no começo e no fim da string
        System.out.println(nome2.trim());
    }
}
