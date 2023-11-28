package academy.devdojo.devdojoacademy.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.devdojoacademy.javacore.Fmodificadoresestaticos.dominio.Carro;

public class CarroTest01 {
    static void calcularVelocidade(double velocidadeLimite, double velocidadeMaxima){
        if (velocidadeMaxima > velocidadeLimite){
            double resultado = velocidadeMaxima - velocidadeLimite;
            System.out.println(resultado);
        }
        if (velocidadeMaxima < velocidadeLimite) {
            double resultado = velocidadeLimite - velocidadeMaxima;
            System.out.println(resultado);
        }
        if (velocidadeMaxima == velocidadeLimite) {
            System.out.println("0");
        }
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.setNome("Volkswaggen");
        carro2.setNome("Hylux");
        carro3.setNome("Fiat");
        carro1.imprime();

        Carro c1 = new Carro("Fusca", 230);
        Carro c2 = new Carro("BMW", 300);
        Carro c3 = new Carro("Mercedes", 250);
        c1.imprime();

        Carro.velocidadeLimite = 300;

        System.out.println("----------");
        calcularVelocidade(c1.getVelocidadeMaxima(), Carro.velocidadeLimite);
        calcularVelocidade(c2.getVelocidadeMaxima(), Carro.velocidadeLimite);
        calcularVelocidade(c3.getVelocidadeMaxima(), Carro.velocidadeLimite);

    }
}
