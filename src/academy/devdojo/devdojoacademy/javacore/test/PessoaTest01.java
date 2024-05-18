package academy.devdojo.devdojoacademy.javacore.test;

import academy.devdojo.devdojoacademy.javacore.Bintroducaometodos.dominio.Pessoa;
// básico
public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
//        pessoa1.idade = 18;
//        pessoa1.nome = "Goku";

        pessoa1.setIdade(18);
        pessoa1.setNome("Goku");

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        pessoa1.imprime();
    }
}
