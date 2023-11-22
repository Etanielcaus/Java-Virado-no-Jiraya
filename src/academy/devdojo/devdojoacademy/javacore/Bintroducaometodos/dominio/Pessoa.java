package academy.devdojo.devdojoacademy.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Idade invalida.");
            return;
        }
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void imprime(){
        System.out.println(this.idade);
        System.out.println(this.nome);
    }
}
