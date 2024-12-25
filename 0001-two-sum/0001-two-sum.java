import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> sumMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sumMap.put(i, nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    sumMap.put(j, nums[j]);
                    break;
                }
            }
            if (1 < sumMap.size()) {
                break;    
            } else {
                sumMap.clear();    
            }
        }

        int[] result = new int[sumMap.keySet().size()];
        int index = 0;
        for (Integer key : sumMap.keySet()) {
            result[index] = key;
            index++;
        }

        return result;

        
    }
}