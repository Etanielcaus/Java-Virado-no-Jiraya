package academy.devdojo.devdojoacademy.javacore.Zgenerics.test;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

//        printConsulta(cachorros);
//        printConsulta(gatos);

        List<Animal> animals = new ArrayList<>();

        printConsultaAnimal(animals);
    }

    //    type erasure ?
//    Tudo que passar é soment leitura, não é possivel adicionar.
//    private static void printConsulta(List<? extends Animal> animals) {
//        Animal a = new Cachorro();
//        Animal a1 = new Gato();
//        for (Animal animal : animals) {
//            animal.consulta();
//        }
////        animals[1] = new Gato();
////        animals.add(new Cachorro());
//
//    }

    private static void printConsultaAnimal(List<? super Animal> animals) {
        animals.add(new Cachorro("toby"));
        animals.add(new Gato("fred"));

        for (Object animal : animals){
            System.out.println(animal.toString());
        }
    }
}






















