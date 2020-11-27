
//Count the frequency of every element in a given array

import java.util.HashMap;

public class FrequencyOfElementInArray {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,4,3,6,7,7,7};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer integer : arr) {
            if (!map.containsKey(integer)) {
                map.put(integer, 1);
            } else {
                map.put(integer, map.get(integer) + 1);
            }
        }
        System.out.println(map);

    }
}
