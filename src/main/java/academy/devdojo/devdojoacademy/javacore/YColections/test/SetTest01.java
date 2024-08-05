package academy.devdojo.devdojoacademy.javacore.YColections.test;

import academy.devdojo.devdojoacademy.javacore.YColections.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
//        Set
//
//        Em Java, um Set é uma interface que representa uma coleção de elementos não ordenados e sem duplicatas.
//        Isso significa que cada elemento só pode aparecer uma vez no conjunto. A interface Set define vários métodos
//                para manipular a coleção, como adicionar, remover e verificar se um elemento está presente.
//
//        HashSet
//
//        HashSet é uma classe concreta que implementa a interface Set. Ela usa uma tabela hash interna para
//        armazenar os elementos de forma eficiente. A tabela hash é uma estrutura de dados que mapeia chaves
//        para valores. No caso do HashSet, a chave é o próprio elemento e o valor é um marcador que indica que a
//        chave está presente no conjunto.


        Set<Manga> mangas = new HashSet<>();
//        Set<Manga> mangas = new LinkedHashSet<>(); // Vai manter a ordem de inserção.

        Manga dbz = new Manga(1L, "Dragon Ball", 55.0,2);
        Manga naruto = new Manga(2L, "Naruto", 30.0, 4);
        Manga attackOnTitan = new Manga(20L, "Attack On Titan", 15.0, 6);
        Manga cavaleirosDoZodiaco = new Manga(15L, "Cavaleiros do Zodiaco", 9.0, 0);

        mangas.add(dbz);
        mangas.add(dbz);
        mangas.add(naruto);
        mangas.add(attackOnTitan);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
