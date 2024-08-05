package academy.devdojo.devdojoacademy.javacore.test;

import academy.devdojo.devdojoacademy.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.devdojoacademy.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {

    public int modificaValor(int x){
        x = 10;
        System.out.println("Valor modificado: " + x);
        return x;
    }
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante imprimirEstudante = new ImpressoraEstudante();

        estudante01.nome = "Zoro";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "ALICIA";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        // Aqui ele utiliza o valor do tipo referencia, ou seja, o valor original muda
        imprimirEstudante.imprimirEstudante(estudante01);
        imprimirEstudante.imprimirEstudante(estudante02);

        // Este é do tipo primitivo, ou seja, o valor original não muda
        int valor = 20;
        EstudanteTest01 obj = new EstudanteTest01();
        int novoValor = obj.modificaValor(valor);
        System.out.println(novoValor);
        System.out.println(valor);


    }


}
