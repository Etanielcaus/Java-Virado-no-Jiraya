package academy.devdojo.devdojoacademy.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
//        \\d -> traz todos os digitos do texto
//        \\D -> traz tudo que não é digito
//        \\s -> traz todos os espaços em branco
//        \\S -> traz todos os caracteres excluindo os brancos
//        \\w -> traz tudo de a-Z, digitos e carateres
//        \\W -> traz tudo que não for incluido no \\w

//        [] -> caractere de range
//        ? -> 0 ou 1 ocorrencia
//        * -> 0 ou mais ocorrencia
//        + -> 1 ou mais ocorrencia
//        {n,m} -> ocorrencia mais especifica
//        () -> Agrupamento
//        | -> ou
//        $ -> fim da linha

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "cafeBABE";
        String texto2 = "12 0x 0x 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " +texto2);
        System.out.println("regex: " +regex);

        while (matcher.find()){
            System.out.print(matcher.start() + ": " +matcher.group() + "\n");
        }

        // Numero Hexadecimal
//        int numeroHex = 0x59F86A;
        int numeroHex = 0xFFFFF;
//        System.out.println(numeroHex);
    }
}
