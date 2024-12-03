class Solution {
    public int[] plusOne(int[] digits) {

        digits[digits.length - 1]++;

        StringBuilder numberString = new StringBuilder();

        for(int i = 0; i < digits.length; i++) {

            int number10 = digits[digits.length - 1 - i] / 10;
            digits[digits.length - 1 - i] = digits[digits.length - 1 - i] % 10;
            numberString.insert(0, String.valueOf(digits[digits.length - 1 - i]));

            if(number10 == 1) {
                if (i == digits.length - 1) {
                    numberString.insert(0, String.valueOf(number10));
                } else {
                    digits[digits.length - 1 - i - 1]++;
                }
            }
        }

        int[] resultArr = new int[numberString.length()];

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = Integer.parseInt(String.valueOf(numberString.charAt(i)));
        }

        return resultArr;
    }
}