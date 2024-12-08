class Solution {
    public int[] plusOne(int[] digits) {
        
        int resultLength = digits.length;

        for (int i = 0; i < digits.length; i++) {
            digits[digits.length - 1 - i]++;
            if (digits[digits.length - 1 - i] == 10) {
                digits[digits.length - 1 - i] = 0;
                if (i == digits.length - 1) {
                    resultLength++;
                }
            } else {
                break;
            }
        }

        if (resultLength > digits.length) {
            int[] result = new int[resultLength];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i - 1];
            }

            return result;

        } else {
            return digits;
        }


    }
}