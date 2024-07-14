package academy.devdojo.devdojoacademy.javacore.ZZBcomportamento.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class compartamentoPorParametroTest03 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(filterList(nums, num -> num % 2 == 0));
    }

    private static <T>  List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }
}
