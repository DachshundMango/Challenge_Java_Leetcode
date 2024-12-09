class Solution {
    public int removeDuplicates(int[] nums) {
        
        int maximumValue = nums[nums.length - 1];
        int index = 1;
        int value = nums[0];
        if (nums.length == 1 || nums[0] == maximumValue) {
            return index;
        }

        for (int i = 1; i < nums.length; i++) {
            if (value < nums[i]) {
                nums[index] = nums[i];
                index++;
                value = nums[i];
            }
        }

        return index; 
    }

}