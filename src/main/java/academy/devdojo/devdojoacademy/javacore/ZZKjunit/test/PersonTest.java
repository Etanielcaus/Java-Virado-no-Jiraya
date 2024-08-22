package academy.devdojo.devdojoacademy.javacore.ZZKjunit.test;

import academy.devdojo.devdojoacademy.javacore.ZZKjunit.dominio.Person;
import academy.devdojo.devdojoacademy.javacore.ZZKjunit.service.PersonService;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person(18);
        System.out.println(PersonService.isAdult(person));
    }
}
