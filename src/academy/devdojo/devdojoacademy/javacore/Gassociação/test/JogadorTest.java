package academy.devdojo.devdojoacademy.javacore.Gassociação.test;

import academy.devdojo.devdojoacademy.javacore.Gassociação.domain.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("CR7");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Neymar");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        System.out.println(jogadores);
        for (Jogador jogadore : jogadores) {
            jogadore.imprime();
        }

    }
}
