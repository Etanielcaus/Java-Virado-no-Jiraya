package academy.devdojo.devdojoacademy.javacore.YColections.test;

import academy.devdojo.devdojoacademy.javacore.YColections.dominio.Consumidor;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

class ConsumidorComparatorTest implements Comparator<Consumidor> {
    @Override
    public int compare(Consumidor o1, Consumidor o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, Integer> map = new TreeMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Consumidor consumidor = new Consumidor("Joao");
        Consumidor consumidor1 = new Consumidor("Pedro");

        NavigableMap<Integer, Consumidor > navigableMap = new TreeMap<>();

        navigableMap.put(1, consumidor);
        navigableMap.put(2, consumidor1);

        for (Map.Entry< Integer, Consumidor> entry : navigableMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getNome());
        }

        System.out.println(map.headMap("C").remove("A"));
        System.out.println(navigableMap.headMap(2));
    }
}
