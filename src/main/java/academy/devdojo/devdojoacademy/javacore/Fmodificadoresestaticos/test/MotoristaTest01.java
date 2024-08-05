package academy.devdojo.devdojoacademy.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.devdojoacademy.javacore.Fmodificadoresestaticos.dominio.Motorista;


public class MotoristaTest01 {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Etaniel", 14);

        Motorista.podeTerHabilitacao(motorista1);


    }
}
