package academy.devdojo.devdojoacademy.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.devdojoacademy.javacore.Fmodificadoresestaticos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        int[] episodios = {1, 2, 3 , 4, 5, 67};

        Anime anime1 = new Anime("DDD", episodios);
        System.out.println(anime1.getNome());
        anime1.getEpisodios2();
        System.out.println("-----------");
        Anime anime2 = new Anime();



    }
}
