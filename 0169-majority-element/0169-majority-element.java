import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> resultMap = new HashMap<>();

        int result = 0;

        for (int num : nums) {
            if (!resultMap.containsKey(num)) {
                resultMap.put(num, 1);
            } else {
                resultMap.put(num, resultMap.get(num) + 1);
            }
            if (resultMap.get(num) > nums.length / 2) {
                result = num;
                break;
            }
        }

        return result;

    
    }
}
        