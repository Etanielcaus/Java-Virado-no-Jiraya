package academy.devdojo.devdojoacademy.javacore.ZZIjdbc.test;

import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer naruto = Producer.ProducerBuilder.builder()
                .withName("Naruto")
                .build();

        ProducerRepository.save(naruto);
    }
}
