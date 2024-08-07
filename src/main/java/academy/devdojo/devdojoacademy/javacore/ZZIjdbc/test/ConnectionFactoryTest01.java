package academy.devdojo.devdojoacademy.javacore.ZZIjdbc.test;

import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.service.ProducerService;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer naruto = Producer.builder().name("Sakura").build();
//        ProducerService.save(naruto);
        ProducerService.delete(4);
    }
}
