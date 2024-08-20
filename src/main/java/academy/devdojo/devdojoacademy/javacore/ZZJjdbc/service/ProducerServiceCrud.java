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
    }

    private static void findName(){
        System.out.println("Write the name to search or let in white for all: ");
        String name = scanner.nextLine();
        List<Producer> producerList = ProducerRepostiryCrud.findName(name);
        for (int i = 0; i < producerList.size(); i++) {
            System.out.printf("%d - %s%n", producerList.get(i).getId(), producerList.get(i).getName());
        }
    }

    private static void deleteWithId(){
        System.out.println("Delete the producer");
        int id = scanner.nextInt();
        ProducerRepostiryCrud.deleteNameWithId(id);
        System.out.println("Producer Delete");
    }
}
