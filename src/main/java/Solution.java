import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            int keyNumber =  target - nums[i];

            if(hashMap.containsKey(keyNumber)){
                return new int[] {hashMap.get(keyNumber), i};
            }
            hashMap.put(nums[i],i);
        }

        return new int[]{0};
    }
}
