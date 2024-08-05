package academy.devdojo.devdojoacademy.javacore.Eblocoinicializacao.test;

import academy.devdojo.devdojoacademy.javacore.Eblocoinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime("Naruto");
        for (int episodio : anime01.getEpisodios()) {
            System.out.print(episodio + " ");
        }


        Anime anime02 = new Anime();

    }
}
