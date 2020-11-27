import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        Integer[] arr = {60,20,30,40,-10,-30};
        int sum = 70;

        Set<Integer> set = new HashSet<>();
        int prefixsum = 0;


        for(Integer integer: arr){
            prefixsum += integer;
            if(prefixsum==sum)
            {
                System.out.println("Yes");
                break;
            }
            else if (set.contains(prefixsum-sum)){
                System.out.println("Yes");
                break;
            }
            set.add(prefixsum);
        }
    }
}
