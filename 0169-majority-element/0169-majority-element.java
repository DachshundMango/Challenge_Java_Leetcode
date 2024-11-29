class Solution {
    public int majorityElement(int[] nums) {

        int result = 0;
        String checkedNumber = ",";

        for (int i = 0; i < nums.length; i++) {
            
            int key = nums[i];
            int count = 0;

            if (!checkedNumber.contains("," + key + ",")) {
                
                for (int j = i; j < nums.length; j++) {
                    if (key == nums[j]) {
                        count++;
                    } 
                }
                
                if (count > (nums.length / 2)) {
                    result = key;
                    break;
                } 

                checkedNumber += "" + key + ",";

            }
       
        }

        return result;
    }
}
        