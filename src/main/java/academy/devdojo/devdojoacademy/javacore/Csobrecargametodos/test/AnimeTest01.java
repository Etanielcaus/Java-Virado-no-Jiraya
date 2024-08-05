package academy.devdojo.devdojoacademy.javacore.Csobrecargametodos.test;

import academy.devdojo.devdojoacademy.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime();

        anime01.setNome("One Piece");
        anime01.setTipo("Anime");
        anime01.setEpisodios(650);
        anime01.setGenero("Luta");

        anime01.imprime();

        System.out.println( "-------------" );

        Anime anime02 = new Anime();

        anime02.init("Dragon Ball", "Anime de TV", 30);
        anime02.init("Dragon Ball", "Anime de TV", 30, "Luta");

        anime02.imprimeComThis();
    }
}
