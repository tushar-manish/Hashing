
// Intersection Of two array

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {
    public static void main(String[] args) {
        Integer[] arr1 = {10,20,30,40};
        Integer[] arr2 = {20,30,70,100};

        Set<Integer> set = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));

        for(Integer integer : set){
            if(set2.contains(integer)){
                System.out.println(integer);
            }
        }
    }
}
