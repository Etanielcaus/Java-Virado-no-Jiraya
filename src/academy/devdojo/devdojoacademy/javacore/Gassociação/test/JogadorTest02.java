package academy.devdojo.devdojoacademy.javacore.Gassociação.test;

import academy.devdojo.devdojoacademy.javacore.Gassociação.domain.Jogador;
import academy.devdojo.devdojoacademy.javacore.Gassociação.domain.Time;

public class JogadorTest02 {

    public static void imprimetime(Time time){
        System.out.println(time.getNome());

        for (Jogador jogador:
             time.getJogadores()) {
            System.out.println(jogador.getNome());
        }
    }
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("CR7");
        Time time1 = new Time("Real Madrid");
        jogador1.setTime(time1);

        jogador1.imprime();

        Jogador jogador2 = new Jogador("Messi");
        jogador2.setTime(time1);
        jogador2.imprime();

        time1.addJogador(jogador1);
        time1.addJogador(jogador2);
        JogadorTest02.imprimetime(time1);

    }
}
