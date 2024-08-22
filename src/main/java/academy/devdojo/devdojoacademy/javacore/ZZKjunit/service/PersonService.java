package academy.devdojo.devdojoacademy.javacore.ZZKjunit.service;

import academy.devdojo.devdojoacademy.javacore.ZZKjunit.dominio.Person;

public class PersonService {

    public static boolean isAdult(Person person){
        return person.getAge() >= 18;
    }
}
