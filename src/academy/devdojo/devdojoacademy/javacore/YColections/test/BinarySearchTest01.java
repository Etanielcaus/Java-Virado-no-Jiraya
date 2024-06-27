package academy.devdojo.devdojoacademy.javacore.YColections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(0);
        nums.add(4);
        nums.add(3);

        Collections.sort(nums);
//        (- (ponto de inserção) -1)
//        index 0,1,2,3
//        value 0,2,3,4
        int binarySearch = Collections.binarySearch(nums, 4);
        System.out.println(binarySearch);
    }
}
