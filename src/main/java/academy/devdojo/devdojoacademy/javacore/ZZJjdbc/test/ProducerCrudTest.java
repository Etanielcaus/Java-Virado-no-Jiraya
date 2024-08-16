package academy.devdojo.devdojoacademy.javacore.ZZJjdbc.test;

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
            ProducerServiceCrud.menuBuilder(op);
        }
    }

    public static void menu(){
        System.out.println("Type the world for your operation");
        System.out.println("1 - search");
        System.out.println("0 - exit");
    }
}
