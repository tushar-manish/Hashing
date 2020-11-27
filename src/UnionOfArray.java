
// Union Of two array

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class UnionOfArray {
    public static void main(String[] args) {
        Integer[] arr1 = {10,20,30,40};
        Integer[] arr2 = {20,30,70,100};

        HashSet<Integer> set = new HashSet<>();
        Collections.addAll(set, arr1);
        set.addAll(Arrays.asList(arr2));

        System.out.println(set.size());

    }
}
