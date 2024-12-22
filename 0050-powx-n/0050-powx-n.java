class Solution {
    public double myPow(double x, int n) {

         long powerIndex = Math.abs(n);

        if (n == Integer.MIN_VALUE) {
            if (x == 1.0 || x == -1.0) {
                return 1.0;
            } else {
                return 0.0;
            }
        }

        if (powerIndex == 0 || x == 1) {
            return 1;
        }

        if (x == -1) {
            if (powerIndex % 2 == 0) {
                return 1;
            } else {
                return -1;
            }
        }

        double result = 1;

        for (int i = 0; i < powerIndex; i++) {
            result = result * x;
        }

        if (n < 0) {
            result = 1 / result;
        }

        return result;
        
    }
}