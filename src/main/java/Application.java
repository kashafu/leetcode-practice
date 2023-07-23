import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        int[] num = {2,7,11,15};
        int target = 13;

        String result = Arrays.toString(TwoSum.twoSum(num, target));
        System.out.println(result);
    }


}
