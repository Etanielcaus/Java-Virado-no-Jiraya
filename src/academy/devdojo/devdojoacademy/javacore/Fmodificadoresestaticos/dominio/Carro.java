package academy.devdojo.devdojoacademy.javacore.Fmodificadoresestaticos.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    public Carro (){

    }
    public Carro (String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }



    public void imprime(){
        System.out.println("----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


    public static void setVelocidadeLimite (double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
        System.out.println(Carro.velocidadeLimite);
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }


}
