package academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.test;

import academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        /**
         * The Builder pattern is a design pattern used to construct complex objects step by step. It allows
         * you to create a representation of an object that can be incrementally built by specifying various
         * parameters. This pattern is particularly useful
         * when an object has a large number of optional parameters or when constructing the object is complex.
         */

        Person build = Person.PersonBuilder
                .builder()
                .firstName("Joao")
                .lastName("Pedro")
                .username("joaopedro")
                .email("joaopedro@gmail.com")
                .build();

        System.out.println(build);
    }
}
