package academy.devdojo.devdojoacademy.javacore.Kenum.test;

import academy.devdojo.devdojoacademy.javacore.Kenum.dominio.Cliente;
import academy.devdojo.devdojoacademy.javacore.Kenum.dominio.Cliente02;
import academy.devdojo.devdojoacademy.javacore.Kenum.dominio.TipoCliente;

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

        if (diaSegunda.equals(diaTerça)){
            System.out.println("Dia igual");
        }
        System.out.println("Dia diferente");
        // ================================================

        Cliente cliente1 = new Cliente("Cliente", "Pessoa_juridica");
        Cliente cliente2 = new Cliente("Cliente2", "Pessoa juridica");

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println("============================");
        // ================================================

        Cliente02 cliente02 = new Cliente02("Nome", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente02.toString());

    }
}
