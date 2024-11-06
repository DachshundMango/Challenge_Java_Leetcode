class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 1;

        for (int i = 0; i < nums.length; i++) {
            
            boolean isEnd = false;
            
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    nums[i + 1] = nums[j];
                    k++;
                    break;
                }
                if (j == nums.length - 1) {
                    isEnd = true;
                    break;
                }
            }

            if (isEnd == true) {
                break;
            }

        }

        return k;    

    }

}