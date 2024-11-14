class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];

        boolean finish = false;

        for (int i = 0; i < numbers.length; i++) {
            
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == target - numbers[i]) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    finish = true;
                    break;
                }
            }

            if (finish == true) {
                break;
            }
        }

        return result;
        
    }
}