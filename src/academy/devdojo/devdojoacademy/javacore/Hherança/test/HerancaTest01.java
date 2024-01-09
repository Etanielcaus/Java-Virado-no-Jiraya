package academy.devdojo.devdojoacademy.javacore.Hherança.test;

import academy.devdojo.devdojoacademy.javacore.Hherança.domain.Endereco;
import academy.devdojo.devdojoacademy.javacore.Hherança.domain.Funcionario;
import academy.devdojo.devdojoacademy.javacore.Hherança.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("12345");
        endereco.setRua("Rua 034");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setCpf("155.3434.344-56");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Pedro");
        funcionario.setCpf("123.456.779-44");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4556.27);
        funcionario.imprime();
        System.out.println(funcionario.getSalario());


        // pessoa.imprime();
    }
}
