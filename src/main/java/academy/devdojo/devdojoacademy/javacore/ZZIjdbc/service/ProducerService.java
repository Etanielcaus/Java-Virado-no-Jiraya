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

    public static void showDriverMetaData(){
        ProducerRepository.showDriverMetaData();
    }

    public static void showTypeScrollWorking(){
        ProducerRepository.showTypeScrollWorking();
    }

    public static void addSalaryInLast(){
        ProducerRepository.addSalary();
    }

    public static void reduceSalary(){
        ProducerRepository.reduceSalary();
    }

    public static void upperCase(){
        ProducerRepository.toUpperCaseAllNames();
    }

    public static List<Producer> findAndUpperCase(String name){
        List<Producer> nameAndToUpperCase = ProducerRepository.findNameAndToUpperCase(name);
        return nameAndToUpperCase;
    }

    public static void findOrInsert(String name){
        ProducerRepository.findOrInsert(name);
    }

    public static void findAndDelete(String name){
        ProducerRepository.findAndDelete(name);
    }

    public static void findByNamePreparedStatement(String name){ ProducerRepository.findByNamePreparedStatement(name);}

    public static void updateWithPreparedStatement(Producer producer){
        ProducerRepository.updateWithPreparedStatement(producer);
    }

    public static void callableStatementFind(String name){
        ProducerRepository.callableStatementFind(name);
    }



    private static void requireValidId(Integer id) {
        if (id == null && id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
