package academy.devdojo.devdojoacademy.javacore.Gassociação.domain;

public class Jogador02 {
    private String nome;
    private Time02 time;

    public Jogador02(String nome) {
        this.nome = nome;
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(time.getNome());
    }

    public Time02 getTime() {
        return time;
    }

    public void setTime(Time02 time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
