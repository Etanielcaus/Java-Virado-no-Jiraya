package academy.devdojo.devdojoacademy.javacore.YColections.test;

import academy.devdojo.devdojoacademy.javacore.YColections.dominio.Manga;
import academy.devdojo.devdojoacademy.javacore.YColections.dominio.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<SmartPhone> {

    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
//        NavigableSet é uma interface em Java que estende a interface SortedSet e fornece métodos adicionais para
//                navegar pelos elementos do conjunto. Isso significa que o NavigableSet é um conjunto ordenado,
//                mas com recursos extras que facilitam a localização de elementos específicos.
//
//        Características do NavigableSet:
//
//                Ordenado: Os elementos em um NavigableSet são ordenados de acordo com sua ordem natural.
//                Sem duplicatas: Um elemento só pode aparecer uma vez no NavigableSet.
//                Acesso por intervalo: O NavigableSet fornece métodos para acessar subconjuntos com base em intervalos
//                de valores. Isso facilita a localização de elementos em um determinado intervalo de valores.
//                Navegação bidirecional: O NavigableSet permite a navegação pelos elementos em ambas as direções
//                (ascendente e descendente). Isso significa que você pode iterar pelos elementos do conjunto na
//                ordem crescente ou decrescente.
//
//        Métodos adicionais do NavigableSet:
//
//                ceiling(): Retorna o menor elemento no conjunto que é maior ou igual a um elemento especificado.
//                floor(): Retorna o maior elemento no conjunto que é menor ou igual a um elemento especificado.
//                higher(): Retorna o menor elemento no conjunto que é maior que um elemento especificado.
//                lower(): Retorna o maior elemento no conjunto que é menor que um elemento especificado.
//                headSet(): Retorna um subconjunto que contém todos os elementos do conjunto que são menores que um
//                elemento especificado.
//                tailSet(): Retorna um subconjunto que contém todos os elementos do conjunto que são maiores ou iguais
//                a um elemento especificado.
//                descendingSet(): Retorna uma visão inversa do conjunto, ou seja, um conjunto com os mesmos elementos,
//                mas ordenados na ordem decrescente.
//                descendingIterator(): Retorna um iterador que itera pelos elementos do conjunto na ordem decrescente.
//
//        Quando usar o NavigableSet:
//
//        Quando você precisa armazenar uma coleção de elementos ordenados e precisa acessar os elementos por
//        intervalo ou navegar pelos elementos em ambas as direções.
//        Quando você precisa de um conjunto com recursos de navegação mais avançados do que os fornecidos pela
//        interface SortedSet.


//        TreeSet é uma classe em Java que implementa a interface SortedSet e usa uma árvore rubro-negra para armazenar
//        os elementos. Isso significa que o TreeSet é um conjunto ordenado, onde os elementos são mantidos em ordem
//        natural ou de acordo com um comparador especificado.
//
//        Características do TreeSet:
//
//                Ordenado: Os elementos em um TreeSet são ordenados de acordo com sua ordem natural ou de acordo com
//        um comparador especificado.
//        Sem duplicatas: Um elemento só pode aparecer uma vez no TreeSet.
//                Eficiente: O TreeSet é uma estrutura de dados eficiente, com tempo médio de O(log n) para operações
//        de busca, inserção e remoção, onde n é o número de elementos no conjunto.
//        Suporta elementos nulos: O TreeSet pode armazenar elementos nulos, desde que a classe dos elementos
//        implemente a interface Comparable e defina a ordenação para elementos nulos.

//        NavigableSet<Integer> set = new TreeSet<Integer>();
//        set.add(1);
//        set.add(2);
//
//        System.out.println(set);
//        System.out.println(set.descendingSet());

        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        SmartPhone smartPhone = new SmartPhone("123", "Nokia");
        set.add(smartPhone);
        System.out.println(set);

        System.out.println("===");

        Manga dbz = new Manga(1L, "Dragon Ball", 55.0,2);
        Manga naruto = new Manga(2L, "Naruto", 30.0, 4);
        Manga attackOnTitan = new Manga(20L, "Attack On Titan", 15.0, 6);
        Manga cavaleirosDoZodiaco = new Manga(15L, "Cavaleiros do Zodiaco", 9.0, 0);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(cavaleirosDoZodiaco);
        mangas.add(dbz);
        mangas.add(attackOnTitan);
        mangas.add(naruto);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("===");

        Manga mangaTest = new Manga(18L, "YUYU", 11);
        System.out.println(mangas.lower(mangaTest));
        System.out.println(mangas.floor(mangaTest));
        System.out.println(mangas.higher(mangaTest));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());


    }
}
