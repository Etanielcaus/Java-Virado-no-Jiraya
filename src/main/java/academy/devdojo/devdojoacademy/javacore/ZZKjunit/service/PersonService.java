package academy.devdojo.devdojoacademy.javacore.ZZKjunit.service;

import academy.devdojo.devdojoacademy.javacore.ZZKjunit.dominio.Person;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PersonService {

    public static boolean isAdult(Person person){
        Objects.requireNonNull(person, "person can't be null");
        return person.getAge() >= 18;
    }

    public static List<Person> personList(List<Person> personListening){
        return personListening.stream().filter(PersonService::isAdult).collect(Collectors.toList());
    }
}
