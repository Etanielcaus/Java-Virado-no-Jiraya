package academy.devdojo.devdojoacademy.javacore.ZZJjdbc.test;

import academy.devdojo.devdojoacademy.javacore.ZZJjdbc.service.AnimeServiceCrud;
import academy.devdojo.devdojoacademy.javacore.ZZJjdbc.service.ProducerServiceCrud;

import java.util.Scanner;

public class ProducerCrudTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        while (true){
            menu();
            op = Integer.parseInt(scanner.nextLine());
            if (op == 0) break;
            if (op == 1){ menuProducer();
                op = Integer.parseInt(scanner.nextLine());
                ProducerServiceCrud.menuBuilder(op);}
            if (op == 2) {menuAnime();
                op = Integer.parseInt(scanner.nextLine());
                AnimeServiceCrud.menuAnime(op);}
        }
    }

    private static void menuProducer(){
        System.out.println("=- PRODUCER -=");
        System.out.println("Type the world for your operation");
        System.out.println("1 - search");
        System.out.println("2 - delete");
        System.out.println("3 - save");
        System.out.println("4 - update");
        System.out.println("0 - exit");
    }

    private static void menuAnime(){
        System.out.println("=- ANIME -=");
        System.out.println("Type the world for your operation");
        System.out.println("1 - search");
        System.out.println("2 - delete");
        System.out.println("3 - save");
        System.out.println("0 - exit");
    }

    public static void menu(){
        System.out.println("=- MENU PRINCIPAL -=");
        System.out.println("Type the world for your operation");
        System.out.println("1 - Producer Menu");
        System.out.println("2 - Anime Menu");
        System.out.println("0 - exit");
    }
}
