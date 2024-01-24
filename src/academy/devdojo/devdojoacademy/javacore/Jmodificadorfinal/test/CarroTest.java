package academy.devdojo.devdojoacademy.javacore.Jmodificadorfinal.test;

import academy.devdojo.devdojoacademy.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.devdojoacademy.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        //Comprador comprador2 = new Comprador();

        carro.setVelocidade(150);
        carro.multar();

        carro.COMPRADOR.setNome("José");
        System.out.println(carro.COMPRADOR);
        
    }
}
