package academy.devdojo.devdojoacademy.javacore.ZZIjdbc.test;

import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer naruto = Producer.builder().name("Sakura").build();
        ProducerRepository.save(naruto);
    }
}
