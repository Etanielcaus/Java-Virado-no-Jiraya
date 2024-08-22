package academy.devdojo.devdojoacademy.javacore.ZZKjunit.service;

import academy.devdojo.devdojoacademy.javacore.ZZKjunit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class PersonServiceTest {
    private Person isAdult;
    private Person isNotAdult;
    private PersonService personService = new PersonService();

    @BeforeEach
    public void setUp(){
        isAdult = new Person(18);
        isNotAdult = new Person(15);
    }


    @DisplayName("Should Person is lower then 18 ")
    @Test
    void person_notIsAdult() {
        Assertions.assertFalse(personService.isAdult(isNotAdult));
    }

    @DisplayName("Should Person is greater then 18")
    @Test
    void person_isAdult() {
        Assertions.assertTrue(personService.isAdult(isAdult));
    }

    @DisplayName("Should Throw NullPointerException")
    @Test
    void nullPointerExceptioni() {
        Assertions.assertThrows(NullPointerException.class ,() -> personService.isAdult(null));
    }

    @DisplayName("Should have two Persons is Adult")
    @Test
    void listPerson() {
        Person person = new Person(16);
        Person person1 = new Person(18);
        Person person2 = new Person(19);
        List<Person> person11 = List.of(person1, person2, person);
        Assertions.assertEquals(2, personService.personList(person11).size());
    }
}