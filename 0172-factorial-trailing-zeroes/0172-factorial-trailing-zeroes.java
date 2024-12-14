class Solution {
    public int trailingZeroes(int n) {
        
        if (n == 0) {
            return 0;
        }

        int count = 0;
        int number = n;

        while (number >= 5) {
            if (number % 5 == 0) {
                int target = number;
                while (target % 5 == 0) {
                    count++;
                    target = target / 5;
                }
            }
            number--;
        }

        return count;

    }
}