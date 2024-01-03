package academy.devdojo.devdojoacademy.javacore.Gassociação.domain;

public class Time02 {
    private String nome;
    private Jogador02[] jogador;

    public Time02(String nome) {
        this.nome = nome;
    }

    public Time02(String nome, Jogador02[] jogador) {
        this.nome = nome;
        this.jogador = jogador;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (jogador == null) return;
        for (Jogador02 jogador02 : jogador) {
            System.out.println(jogador02.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador02[] getJogador() {
        return jogador;
    }

    public void setJogador(Jogador02[] jogador) {
        this.jogador = jogador;
    }
}
