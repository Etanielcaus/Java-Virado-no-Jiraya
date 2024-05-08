package academy.devdojo.devdojoacademy.javacore.Qstrings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder( nome);
        String nome2 = " DevDojo";
        sb.append(nome2);
        System.out.println(sb);


    }
}
