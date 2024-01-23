package academy.devdojo.devdojoacademy.javacore.Jmodificadorfinal.test;

import academy.devdojo.devdojoacademy.javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setVelocidade(300);
        carro.multar();
    }
}
