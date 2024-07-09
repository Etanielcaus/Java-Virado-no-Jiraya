package academy.devdojo.devdojoacademy.javacore.Zgenerics.test;

abstract class Animal{
    public abstract void consulta();
}




class Cachorro extends Animal{
    private String nome;
    @Override
    public void consulta() {
        System.out.println("Consultado cachorro.");
    }

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public Cachorro() {
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

class Gato extends Animal{
    private String nome;
    @Override
    public void consulta() {
        System.out.println("Consultado gato.");
    }

    public Gato(String nome) {
        this.nome = nome;
    }

    public Gato() {
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
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

    @Override
    public String toString() {
        return super.toString();
    }
}
