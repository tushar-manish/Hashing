
// Count Distinct Element in an array

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,6,4,32,1};
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
        System.out.println(hashSet.size());

    }
}
