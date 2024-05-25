package academy.devdojo.devdojoacademy.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
//        \\d -> traz todos os digitos do texto
//        \\D -> traz tudo que não é digito
//        \\s -> traz todos os espaços em branco
//        \\S -> traz todos os caracteres excluindo os brancos
//        \\w -> traz tudo de a-Z, digitos e carateres
//        \\W -> traz tudo que não for incluido no \\w

        String regex = "\\w";
        String texto = "h24h5h2h1h4h j2knj4n32jn4";
//        String texto2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " +texto);
        System.out.println("regex: " +regex);

        while (matcher.find()){
            System.out.print(matcher.start() + ": " +matcher.group() + "\n");
        }
    }
}
