class Solution {
    public int majorityElement(int[] nums) {

        int result = 0;


        for (int i = 0; i < nums.length; i++) {

            int key = nums[i];
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (key == nums[j]) {
                    count++;
                }
            }

            if (count > (nums.length / 2)) {
                result = key;
                break;
            }

        }

        return result;

    }

}
        