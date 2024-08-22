package academy.devdojo.devdojoacademy.javacore.ZZKjunit.service;

import academy.devdojo.devdojoacademy.javacore.ZZKjunit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonServiceTest {

    @DisplayName("Test to show if the Person is true")
    @Test
    void isAdult() {
        Person person = new Person(15);
        Assertions.assertFalse(PersonService.isAdult(person));
    }
}