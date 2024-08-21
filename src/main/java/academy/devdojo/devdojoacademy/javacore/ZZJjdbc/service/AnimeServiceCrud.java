package academy.devdojo.devdojoacademy.javacore.ZZJjdbc.service;

import academy.devdojo.devdojoacademy.javacore.ZZJjdbc.dominio.Anime;
import academy.devdojo.devdojoacademy.javacore.ZZJjdbc.dominio.Producer;
import academy.devdojo.devdojoacademy.javacore.ZZJjdbc.repository.AnimeRepositoryCrud;

import java.util.Scanner;

public class AnimeServiceCrud {
    private static final Scanner op = new Scanner(System.in);

    public static void menuAnime(int op) {
        switch (op) {
            case 1 -> findName();
            case 2 -> delete();
            case 3 -> save();
        }
    }

    private static void findName() {
        System.out.println("-=- Find Name Method -=-");
        System.out.println("Type the name of anime or let in white for all:");
        Anime name = AnimeRepositoryCrud.findName(op.nextLine());
        System.out.println(name);
    }

    private static void delete() {
        System.out.println("-=- Delete Method -=-");
        System.out.println("Delete the Anime");
        String i = op.nextLine();
        System.out.println("Are you sure? S/N");
        String s1 = op.nextLine();
        if (s1.equals("s")) {
            AnimeRepositoryCrud.deleteAnime(Integer.parseInt(i));
            System.out.println("Anime Deleted");
        }
    }

    private static void save(){
        System.out.println("-=- Save Method -=-");
        // Captura o nome do anime
        System.out.print("Enter Anime Name: ");
        String name = op.nextLine();

        // Captura o número de episódios
        System.out.print("Enter Number of Episodes: ");
        int episodes = Integer.parseInt(op.nextLine());

        // Captura o ID do produtor
        System.out.print("Enter Producer ID: ");
        int producerId = Integer.parseInt(op.nextLine());

        Anime build = Anime.builder().name(name)
                .episodes(episodes)
                .producer(Producer.builder().id(producerId).build()).build();
        AnimeRepositoryCrud.save(build);

        System.out.println(build.getId());
        System.out.println("id producer" +build.getProducer().getId());
        System.out.println("name producer" + build.getProducer().getName());

        System.out.println("Anime saved successfully!");
    }
}
