package academy.devdojo.devdojoacademy.javacore.ZZJjdbc.service;

import academy.devdojo.devdojoacademy.javacore.ZZJjdbc.dominio.Producer;
import academy.devdojo.devdojoacademy.javacore.ZZJjdbc.repository.ProducerRepostiryCrud;

import java.util.List;
import java.util.Scanner;

public class ProducerServiceCrud {
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuBuilder(int op){
        switch (op){
            case 1: findName();
        }
        switch (op){
            case 2: deleteWithId();
        }
        switch (op){
            case 3: save();
        }
    }

    private static void findName(){
        System.out.println("=-=");
        System.out.println("Write the name to search or let in white for all: ");
        String name = scanner.nextLine();
        List<Producer> producerList = ProducerRepostiryCrud.findName(name);
        producerList.forEach(producer -> System.out.printf("[%d] - %s%n", producer.getId(), producer.getName()));
    }

    private static void deleteWithId(){
        System.out.println("=-=");
        System.out.println("Delete the producer");
        int id = scanner.nextInt();
        System.out.println("Are you sure? s/n");
        String s = scanner.nextLine();
        if (s.equals("s")) ProducerRepostiryCrud.deleteNameWithId(id);
        System.out.println("Producer Delete");
        System.out.println("Producer Delete");
    }

    private static void save(){
        System.out.println("=-=");
        System.out.println("Saving a producer");
        String s = scanner.nextLine();
        Producer build = Producer.builder().name(s).build();
        ProducerRepostiryCrud.save(build);
        System.out.println(build + " Added");
    }
}
