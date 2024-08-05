package academy.devdojo.devdojoacademy.javacore.Bintroducaometodos.dominio;
import academy.devdojo.devdojoacademy.javacore.Bintroducaometodos.dominio.Estudante;


public class ImpressoraEstudante {
    public void imprimirEstudante(Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        String nomeando = estudante.nome;


        if (nomeando.length() > 5){
            System.out.println(nomeando.charAt(4));
        } else {
            System.out.println(nomeando);
        }
    }
}
