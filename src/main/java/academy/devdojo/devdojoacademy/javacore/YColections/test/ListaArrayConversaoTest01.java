package academy.devdojo.devdojoacademy.javacore.YColections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("===");

        Integer[] numerosArray = new Integer[4];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

//        List<Integer> arrayToList = Arrays.asList(numerosArray); // Não aconselhavel, já que ele cria um Link
//        entre um a List e o Array
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(4);
//        numerosArray[3] = 5;
        System.out.println(numerosList);


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    }
}
