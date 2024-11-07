class Solution {
    public void rotate(int[] nums, int k) {

        int remainder = k % nums.length;

        int[] move = new int[remainder];

        for (int i = 0; i < remainder; i++) {
            move[i] = nums[nums.length - remainder + i];

        }

        for (int i = nums.length - 1 - remainder; 0 <= i; i--) {
            nums[i + remainder] = nums[i];
        }

        for (int i = 0; i < remainder; i++) {
            nums[i] = move[i];
        }
   
    }
}