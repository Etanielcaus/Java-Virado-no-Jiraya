package academy.devdojo.devdojoacademy.javacore.Kenum.test;

import academy.devdojo.devdojoacademy.javacore.Kenum.dominio.*;

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
        Cliente02 cliente03 = new Cliente02("Nome", TipoCliente.PESSOA_JURIDICA);
        //System.out.println(cliente02.toString());
        // ================================================

        Cliente03 cliente04 = new Cliente03("João", TipoCliente.PESSOA_FISICA, Cliente03.TipoPagamento.CREDITO);
        System.out.println(cliente04);

        Cliente03 cliente05 =  new Cliente03("Jose", TipoCliente.PESSOA_JURIDICA, Cliente03.TipoPagamento.DEBITO);
        System.out.println(cliente05);
        System.out.println("==================================");

        // ================================================

        Cliente04 cliente06 = new Cliente04("Pedro", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO, 50);
        // gambiarra teste.
        System.out.println(cliente06.getTipoPagamento().calcularDesconto(cliente06.getValorDoProduto()));

    }
}
