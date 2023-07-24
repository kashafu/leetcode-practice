import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] num = {2,7,11,15};
        int target = 13;

        String result = Arrays.toString(solution.twoSumHashMap(num, target));
        System.out.println(result);
    }


}
