import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PairWithGivenSumInArray {
    public static void main(String[] args) {
        Integer[] arr = {10,20,30,10};
        int sum = 30;

        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));

        for(Integer integer : set){
            if(set.contains(Math.abs(sum-integer)))
            {
                System.out.println("Yes  "+integer+"  "+(sum-integer));
                break;
            }
        }
    }
}
