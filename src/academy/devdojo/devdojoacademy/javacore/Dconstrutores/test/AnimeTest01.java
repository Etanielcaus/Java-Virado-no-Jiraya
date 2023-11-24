package academy.devdojo.devdojoacademy.javacore.Dconstrutores.test;

import academy.devdojo.devdojoacademy.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime dragonBall = new Anime("Dragon Ball", "Desenho", 20, "Luta");
        dragonBall.setEpisodios(35);

        dragonBall.imprimeComThis();

        Anime naruto = new Anime();
        naruto.setNome("Naruto");
        naruto.imprimeComThis();
    }
}
