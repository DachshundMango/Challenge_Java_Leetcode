import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> resultMap = new HashMap<>();

        for (int num : nums) {
            if (!resultMap.containsKey(num)) {
                resultMap.put(num, 1);
            } else {
                resultMap.put(num, resultMap.get(num) + 1);
            }

        }

        int result = 0;

        for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                result = entry.getKey();
                break;
            }
        }

        return result;

    
    }
}
        