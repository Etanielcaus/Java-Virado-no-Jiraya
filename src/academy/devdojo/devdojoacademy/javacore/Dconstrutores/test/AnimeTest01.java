package academy.devdojo.devdojoacademy.javacore.Dconstrutores.test;

import academy.devdojo.devdojoacademy.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        // Com construtor simples
        Anime dragonBall = new Anime("Dragon Ball", "Desenho", 20, "Luta");
        dragonBall.imprimeComThis();

        System.out.println("--------------");

        // Com construtor sem argumentos
        Anime naruto = new Anime();
        naruto.setNome("Naruto");
        naruto.imprimeComThis();

        System.out.println("--------------");

        // Com sobrecarga de Construtor
        Anime onePiece = new Anime("One Piece", "Desenho", 650, "Luta", "Piratas");
        onePiece.imprimeComThis();
    }
}
