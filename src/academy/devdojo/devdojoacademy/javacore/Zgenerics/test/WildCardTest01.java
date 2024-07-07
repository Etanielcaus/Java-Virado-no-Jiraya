package academy.devdojo.devdojoacademy.javacore.Zgenerics.test;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultado cachorro.");
    }
}

class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultado gato.");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros2 = {new Cachorro(), new Cachorro()};

        Gato[] gatoes = {new Gato(), new Gato()};

        printConsulta(cachorros2);
        printConsulta(gatoes);

        Animal[] animales = {new Cachorro(), new Gato()};
        printConsulta(animales);


    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
//        animals[1] = new Gato();

    }
}
