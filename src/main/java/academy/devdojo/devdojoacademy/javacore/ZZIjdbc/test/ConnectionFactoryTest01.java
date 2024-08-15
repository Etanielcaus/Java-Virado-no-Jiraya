package academy.devdojo.devdojoacademy.javacore.ZZIjdbc.test;

import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.service.ProducerService;
import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer naruto = Producer.builder().name("Sakura").build();
        Producer producerToUpdate = Producer.builder().id(7).name("Goji").build();
        Producer producerToUpdate2 = Producer.builder().id(3).name("Goku").build();
//        ProducerService.save(naruto);
//        ProducerService.delete(4);
//        ProducerService.update(producerToUpdate);
//        List<Producer> all = ProducerService.findAll();
//        log.info("Producers found '{}'", all );
//        List<Producer> naruto1 = ProducerService.findByName("Sakura");
//        log.info("Producers found '{}'", naruto1 );
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        ProducerService.addSalaryInLast();
//        ProducerService.reduceSalary();
//        ProducerService.upperCase();
//        ProducerService.findAndUpperCase("goji");
//        ProducerService.findOrInsert("goku");
//        ProducerService.findAndDelete("dbz");
//        ProducerService.findByNamePreparedStatement("gargadfa");
//        ProducerService.updateWithPreparedStatement(producerToUpdate2);
//        ProducerService.callableStatementFind("sakura");

        Producer producerToUpdate3 = Producer.builder().id(8).name("Vegeta").build();
//        ProducerServiceRowSet.updateProducer(producerToUpdate3);
        ProducerServiceRowSet.updateCachedProducer(producerToUpdate3);

        List<Producer> list = ProducerServiceRowSet.findByNameWithJDBCRowSet("");
        log.info(list);
    }
}
