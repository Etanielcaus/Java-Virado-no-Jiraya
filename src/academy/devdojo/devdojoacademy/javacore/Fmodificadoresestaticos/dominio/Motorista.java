package academy.devdojo.devdojoacademy.javacore.Fmodificadoresestaticos.dominio;

public class Motorista {
    private String nome;
    private int idade;

    public Motorista(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public static void podeTerHabilitacao(Motorista motorista){
        if (motorista.getIdade() >= 18){
            System.out.println("Pode tirar habilitacao");
        }
        if (motorista.getIdade() < 18){
            System.out.println(motorista.getNome() + " Não pode tirar habilitacao");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
