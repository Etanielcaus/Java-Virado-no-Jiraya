package academy.devdojo.devdojoacademy.javacore.ZZIjdbc.service;

import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(int id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll(){
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name){
        return ProducerRepository.findByName(name);
    }

    public static void showProducerMetaData(){
        ProducerRepository.showProducerMetaData();
    }



    private static void requireValidId(Integer id) {
        if (id == null && id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
