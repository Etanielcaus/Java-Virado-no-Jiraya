package academy.devdojo.devdojoacademy.javacore.Gassociação.test;

import academy.devdojo.devdojoacademy.javacore.Gassociação.domain.Jogador02;
import academy.devdojo.devdojoacademy.javacore.Gassociação.domain.Time02;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador02 jogador1 = new Jogador02("Pelé");
        Jogador02 jogador2 = new Jogador02("Cafu");
        Jogador02 jogador3 = new Jogador02("Romário");
        Jogador02 jogador4 = new Jogador02("Kaka");
        Time02 time = new Time02("Brazil");

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);
        jogador4.setTime(time);

        Jogador02[] jogador02 = {jogador1, jogador2, jogador3, jogador4};

        jogador4.imprime();
        jogador3.imprime();
        jogador2.imprime();
        jogador1.imprime();

        time.setJogador(jogador02);
        System.out.println("==================");
        time.imprime();

    }
}
