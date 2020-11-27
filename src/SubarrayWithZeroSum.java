import java.util.HashSet;
import java.util.Set;

public class SubarrayWithZeroSum {
    public static void main(String[] args) {
        Integer[] arr = {80,20,30,10,-10,-30};

        Set<Integer> set = new HashSet<>();
        int prefixsum = 0;


        for(Integer integer: arr){
            prefixsum += integer;
            if(prefixsum==0)
            {
                System.out.println("Yes");
                break;
            }
            else if (set.contains(prefixsum)){
                System.out.println("Yes");
                break;
            }
            set.add(prefixsum);
        }
    }
}
