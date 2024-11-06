class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 1;

        for (int i = 0; i < nums.length; i++) {

            boolean isEnd = false;

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] != nums[i]) {
                    for (int m = i + 1; m < j; m++) {
                        nums[m] = nums[j];
                    }
                    if (j == nums.length - 1) {
                    isEnd = true;
                    }
                    break;
                } else if (j == nums.length - 1) {
                    k--;
                    isEnd = true;
                    break;
                }
            }

            k++;

            if (isEnd == true) {
                break;
            }

        }


        return k;
    }



}