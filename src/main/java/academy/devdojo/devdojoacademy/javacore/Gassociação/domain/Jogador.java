package academy.devdojo.devdojoacademy.javacore.Gassociação.domain;

public class Jogador {
    private String nome;

    private Time time;


    public void imprime(){
        System.out.println("Nome: " + this.nome);
        if (time != null) {
            System.out.println("Time: " + time.getNome());
        }
        System.out.println("---");
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }
}
