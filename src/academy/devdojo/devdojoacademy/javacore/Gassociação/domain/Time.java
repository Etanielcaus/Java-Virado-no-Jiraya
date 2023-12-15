package academy.devdojo.devdojoacademy.javacore.Gassociação.domain;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Jogador> jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }


    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void addJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
